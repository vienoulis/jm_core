package ru.vienoulis.mail_worker;
//    Лукьянов Роман

public class Thief implements MailService {
    private int minPrice;
    private int stolenValue = 0;


    public void setStolenValue(int stolenValue) {
        this.stolenValue += stolenValue;
    }

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            int value = ((MailPackage) mail).getContent().getPrice();
            if (value >= this.minPrice){
                setStolenValue(value);

                String content = ((MailPackage) mail).getContent().toString();
                Package thiefPackage = new Package("stones instead of " + content, 0);
                return new MailPackage(((MailPackage) mail).from, ((MailPackage) mail).to,thiefPackage);
            }
        }

        return mail;
    }
}
