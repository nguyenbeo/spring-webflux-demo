package se.mikka.webflux.demo.repository;

public class Transaction {

    private String id;
    private long amount;
    private String currency;

    public Transaction(String id, long amount, String currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
