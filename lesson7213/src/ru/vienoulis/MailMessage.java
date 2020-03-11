package ru.vienoulis;

public class MailMessage<St> extends AbstractCase<String> {

    private String content;

    public MailMessage(String from, String to, String content) {
        super(from, to);
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

}
