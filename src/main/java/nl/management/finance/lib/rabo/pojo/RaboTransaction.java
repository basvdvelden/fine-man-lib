package nl.management.finance.lib.rabo.pojo;

import java.util.List;
import java.util.Locale;

public class RaboTransaction {
    private String bankTransactionCode;
    private String bookingDate;
    private String checkId;
    private RaboTransactionsAccount creditorAccount;
    private String creditorAgent;
    private String creditorId;
    private String creditorName;
    private RaboTransactionsAccount debtorAccount;
    private String debtorAgent;
    private String debtorName;
    private String endToEndId;
    private String entryReference;
    private List<RaboExchangeRate> exchangeRate;
    private String initiatingPartyName;
    private RaboInstructedAmount instructedAmount;
    private String mandateId;
    private Integer numberOfTransactions;
    private String paymentInformationIdentification;
    private String proprietaryBankTransactionCode;
    private String purposeCode;
    private String purposeProprietary;
    private String rateBookingDateTime;
    private String raboDetailedTransactionType;
    private String raboTransactionTypeName;
    private String reasonCode;
    private String remittanceInformationStructured;
    private String remittanceInformationUnstructured;
    private RaboTransactionAmount transactionAmount;
    private String ultimateCreditor;
    private String ultimateDebtor;
    private String valueDate;

    public String getBankTransactionCode() {
        return bankTransactionCode;
    }

    public void setBankTransactionCode(String bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public RaboTransactionsAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(RaboTransactionsAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public String getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(String creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public String getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(String creditorId) {
        this.creditorId = creditorId;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public RaboTransactionsAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(RaboTransactionsAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public String getDebtorAgent() {
        return debtorAgent;
    }

    public void setDebtorAgent(String debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    public String getEntryReference() {
        return entryReference;
    }

    public void setEntryReference(String entryReference) {
        this.entryReference = entryReference;
    }

    public List<RaboExchangeRate> getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(List<RaboExchangeRate> exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getInitiatingPartyName() {
        return initiatingPartyName;
    }

    public void setInitiatingPartyName(String initiatingPartyName) {
        this.initiatingPartyName = initiatingPartyName;
    }

    public RaboInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(RaboInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public String getMandateId() {
        return mandateId;
    }

    public void setMandateId(String mandateId) {
        this.mandateId = mandateId;
    }

    public Integer getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(Integer numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public String getPaymentInformationIdentification() {
        return paymentInformationIdentification;
    }

    public void setPaymentInformationIdentification(String paymentInformationIdentification) {
        this.paymentInformationIdentification = paymentInformationIdentification;
    }

    public String getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }

    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    public String getPurposeProprietary() {
        return purposeProprietary;
    }

    public void setPurposeProprietary(String purposeProprietary) {
        this.purposeProprietary = purposeProprietary;
    }

    public String getRateBookingDateTime() {
        return rateBookingDateTime;
    }

    public void setRateBookingDateTime(String rateBookingDateTime) {
        this.rateBookingDateTime = rateBookingDateTime;
    }

    public String getRaboDetailedTransactionType() {
        return raboDetailedTransactionType;
    }

    public void setRaboDetailedTransactionType(String raboDetailedTransactionType) {
        this.raboDetailedTransactionType = raboDetailedTransactionType;
    }

    public String getRaboTransactionTypeName() {
        return raboTransactionTypeName;
    }

    public void setRaboTransactionTypeName(String raboTransactionTypeName) {
        this.raboTransactionTypeName = raboTransactionTypeName;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getRemittanceInformationStructured() {
        return remittanceInformationStructured;
    }

    public void setRemittanceInformationStructured(String remittanceInformationStructured) {
        this.remittanceInformationStructured = remittanceInformationStructured;
    }

    public String getRemittanceInformationUnstructured() {
        return remittanceInformationUnstructured;
    }

    public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
        this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    }

    public RaboTransactionAmount getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(RaboTransactionAmount transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getUltimateCreditor() {
        return ultimateCreditor;
    }

    public void setUltimateCreditor(String ultimateCreditor) {
        this.ultimateCreditor = ultimateCreditor;
    }

    public String getUltimateDebtor() {
        return ultimateDebtor;
    }

    public void setUltimateDebtor(String ultimateDebtor) {
        this.ultimateDebtor = ultimateDebtor;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "[creditorIban=%s, debtorIban=%s, creditorName=%s, checkId=%s, debtorName=%s, initiatingParty=%s, " +
                        "ultimateCreditor=%s, ultimateDebtor=%s, amount=%s, descriptionUnstructured=%s, " +
                        "descriptionStructured=%s, reasonCode=%s, raboDetailedTransactionType=%s, " +
                        "raboTransactionTypeName=%s, purposeCode=%s, debtorAgent=%s, " +
                        "creditorAgent=%s, creditorId=%s] \n\n",
                getCreditorAccount().getIban(), getDebtorAccount().getIban(), getCreditorName(),
                getCheckId(), getDebtorName(), getInitiatingPartyName(), getUltimateCreditor(),
                getUltimateDebtor(), getTransactionAmount().getAmount(), getRemittanceInformationUnstructured(),
                getRemittanceInformationStructured(), getReasonCode(), getRaboDetailedTransactionType(),
                getRaboTransactionTypeName(), getPurposeCode(), getDebtorAgent(), getCreditorAgent(),
                getCreditorId());
    }
}
