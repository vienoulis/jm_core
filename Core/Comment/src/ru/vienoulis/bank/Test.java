package ru.vienoulis.bank;

public class Test {
    public static void main(String[] args) {
        BankClient client1 = new BankClient("Bad");
        BankClient client2 = new BankClient("Problem with law");
        BankClient client3 = new BankClient("Good history");
        BankWorker employee = new BankEmployee();

        System.out.println(getCreditForClient(employee, client1));
        System.out.println(getCreditForClient(employee, client2));
        System.out.println(getCreditForClient(employee, client3));
    }
    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient)  {

        try {
            return  bankWorker.checkClientForCredit(bankWorker, bankClient);

        } catch (BadCreditHistoryException e){
            System.out.println(e.getMessage());
        } catch (ProblemWithLawException ignored){

        }
        return false;
    }

}
