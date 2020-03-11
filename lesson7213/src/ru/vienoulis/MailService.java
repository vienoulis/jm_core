package ru.vienoulis;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Executable> {
    private Map<String, List<T>> mailBox = new HashMap() {
        @Override
        public List<T> get(Object key) {
            return (List<T>) getOrDefault(key, Collections.<String>emptyList());
        }
    };


    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }


    @Override
    public void accept(Executable t) {
        List<T> list = new ArrayList<>();
        list.add((T)t.getContent());
        mailBox.merge(t.getTo(), list, (a, b) -> {
            a.add((T)t.getContent());
            return a;
        });
    }

}
