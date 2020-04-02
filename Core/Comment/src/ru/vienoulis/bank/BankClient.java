package ru.vienoulis.bank;

public class BankClient {
    public String getCreditHistori() {
        return creditHistori;
    }

    private String creditHistori;

    public BankClient(String creditHistori) {
        this.creditHistori = creditHistori;
    }
}
