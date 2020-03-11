package ru.vienoulis;

public class Salary<Integer>  extends AbstractCase<Integer> implements Executable<Integer> {
    private Integer content;

    public Salary(String from, String to, Integer content) {
        super(from, to);
        this.content = content;
    }
    @Override
    public Integer getContent() {
        return content;
    }
}
