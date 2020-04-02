package ru.vienoulis.bank;

public interface BankWorker {
    public boolean checkClientForCredit(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
