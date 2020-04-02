package ru.vienoulis.bank;

public class BankEmployee implements BankWorker {
    public boolean checkClientForCredit(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.getCreditHistori().equals("Bad")){
            throw new BadCreditHistoryException("Проблемы с банковской историей");
        }
        else if (bankClient.getCreditHistori().equals("Problem with law")) {
            throw new ProblemWithLawException();
        }
        else {
            return true;
        }
    }
}
