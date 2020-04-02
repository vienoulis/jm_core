package ru.vienoulis.mail_worker;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage){
            String content = ((MailPackage) mail).getContent().getContent();
            if ( content.contains("weapons") || content.contains("banned substance") ){
                throw new IllegalPackageException();
            } else if (content.contains("stones")){
                throw new StolenPackageException();
            }
        }

        return mail;
    }
}
