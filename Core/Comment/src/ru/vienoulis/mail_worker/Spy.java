package ru.vienoulis.mail_worker;

import java.util.logging.Level;
import java.util.logging.Logger;

/***
 * 2) Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется от экземпляра Logger,
 * с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса MailMessage и пишет в логгер следующие сообщения
 * (в выражениях нужно заменить части в фигурных скобках на значения полей почты):
 * 2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с уровнем WARN: Detected target mail correspondence: from {from} to {to} "{message}"
 * 2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
 */
public class Spy  implements MailService{
    private static Logger LOGGER;

    public Spy(Logger logger) {
        LOGGER = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage){
            if (mail.getFrom().equals("Austin Powers") || mail.getTo().equals("Austin Powers") ){
                String[] objects = new String[]{ mail.getFrom(),mail.getTo() ,((MailMessage) mail).getMessage() };
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        objects);
            } else {
                String[] objects = new String[]{ mail.getFrom(),mail.getTo()};
                LOGGER.log(Level.INFO, "Usual correspondence: from {0} to {1}", objects);
            }
        }

        return mail;
    }
}
