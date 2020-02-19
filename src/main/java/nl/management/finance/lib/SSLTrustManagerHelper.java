package nl.management.finance.lib;


import javax.net.ssl.*;
import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import java.security.cert.CertificateException;


public class SSLTrustManagerHelper {
    private static final String TAG = "SSLTrustMgrHelper";

    private InputStream keyStoreStream;
    private String keyStorePassword;
    private InputStream trustStore;
    private String trustStorePassword;
    private X509TrustManager tm;
    private KeyStore keyStore;

    public SSLTrustManagerHelper(InputStream keyStoreStream,
                                 String keyStorePassword,
                                 InputStream trustStore,
                                 String trustStorePassword) {
        if (keyStoreStream == null || keyStorePassword.trim().isEmpty() || trustStore == null || trustStorePassword.trim().isEmpty()) {
            throw new RuntimeException("TrustStore or KeyStore details are empty, which are required to be present when SSL is enabled");
        }

        this.keyStoreStream = keyStoreStream;
        this.keyStorePassword = keyStorePassword;
        this.trustStore = trustStore;
        this.trustStorePassword = trustStorePassword;
    }

    public SSLContext clientSSLContext() {
        try {
            TrustManagerFactory trustManagerFactory = getTrustManagerFactory(trustStore, trustStorePassword);
            KeyManagerFactory keyManagerFactory = getKeyManagerFactory(keyStorePassword);
            tm = (X509TrustManager) trustManagerFactory.getTrustManagers()[0];

            return getSSLContext(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers());
        } catch (UnrecoverableKeyException | NoSuchAlgorithmException | CertificateException | KeyStoreException | IOException | KeyManagementException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                this.trustStore.close();
                this.keyStoreStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public X509TrustManager getTrustManager() {
        return tm;
    }

    private static SSLContext getSSLContext(KeyManager[] keyManagers, TrustManager[] trustManagers) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        sslContext.init(keyManagers, trustManagers, null);
        return sslContext;
    }

    private KeyManagerFactory getKeyManagerFactory(String keystorePassword) throws NoSuchAlgorithmException, KeyStoreException, IOException, CertificateException, UnrecoverableKeyException {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, keystorePassword.toCharArray());
        return keyManagerFactory;
    }

    private TrustManagerFactory getTrustManagerFactory(InputStream truststore, String truststorePassword) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        keyStore = loadKeyStore(truststore, truststorePassword);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return trustManagerFactory;
    }

    private static KeyStore loadKeyStore(InputStream keystoreStream, String keystorePassword) throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException {
        if (keystoreStream == null) {
            throw new RuntimeException("keystore was null.");
        }
        KeyStore keystore = KeyStore.getInstance("PKCS12");
        keystore.load(keystoreStream, keystorePassword.toCharArray());
        return keystore;
    }

}