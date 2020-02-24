package ru.vienoulis.serial;

import java.io.Serializable;

public class Animal implements Serializable {
    private int age ;
    private transient Tail tail;
    String name;

    public Animal(int age, Tail tail, String name) {
        this.age = age;
        this.tail = tail;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
