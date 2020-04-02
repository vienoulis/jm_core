package ru.vienoulis.bank;

public class BadCreditHistoryException extends Exception {
    public BadCreditHistoryException(String message) {
        super(message);
    }
}
