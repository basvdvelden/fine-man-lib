package nl.management.finance.lib.rabo.pojo;

import java.util.List;

public class RaboTransactionsPerType {
    private List<RaboTransaction> booked;
    private List<RaboTransaction> pending;

    public List<RaboTransaction> getBooked() {
        return booked;
    }

    public void setBooked(List<RaboTransaction> booked) {
        this.booked = booked;
    }

    public List<RaboTransaction> getPending() {
        return pending;
    }

    public void setPending(List<RaboTransaction> pending) {
        this.pending = pending;
    }
}
