package ru.vienoulis.coret_6.part_1.exs_13;

import java.util.Arrays;

public /*static*/ class DynamicArray<T> {

    private int size = 10;
    private int counter = 0;
    private Object[] objects = new Object[size];

    public DynamicArray() {
    }

    public T get(int index) {
        return (T) objects[index];
    }

    public void remove(int index) {
        --counter;
        for (int i = index; i < size; i++) {
            objects[i - 1] = objects[i];
        }
    }

    public void add(T el) {
        if (++counter > size) {
            size += size / 2;
            objects = Arrays.copyOf(objects, size);
        }
        objects[counter-1] = el;
    }
}
