package ru.vienoulis.mail_worker;

public class UntrustworthyMailWorker extends RealMailService {

    private MailService[] mailServices;
    private RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public MailService[] getMailServices() {
        return mailServices;
    }

    public RealMailService getRealMailService(){
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService mailService : this.getMailServices()) {
            mail = mailService.processMail(mail);
        }
        return getRealMailService().processMail(mail);
    }
}
