package ru.vienoulis;

public abstract class AbstractCase<T> implements Executable<T>{

     String from;
     String to;
     T content;


    public AbstractCase(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public abstract T getContent();

    @Override
    public String getTo() {
        return null;
    }

    @Override
    public String getFrom() {
        return null;
    }
}
