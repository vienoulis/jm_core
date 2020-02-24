package ru.vienoulis.serial;

import java.io.Serializable;

public class Tail {
    private int lenth;

    @Override
    public String toString() {
        return "Tail{" +
                "lenth=" + lenth +
                '}';
    }

    public Tail(int lenth) {
        this.lenth = lenth;
    }
}
