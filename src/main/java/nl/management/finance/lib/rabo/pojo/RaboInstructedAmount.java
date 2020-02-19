package nl.management.finance.lib.rabo.pojo;

public class RaboInstructedAmount {
    private Double amount;
    private String sourceCurrency;

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
