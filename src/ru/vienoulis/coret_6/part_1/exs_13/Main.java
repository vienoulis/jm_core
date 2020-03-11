package ru.vienoulis.coret_6.part_1.exs_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        for (int i = 0; i < 20; i++) {
            dynamicArray.add(i);
        }
        System.out.println(dynamicArray.get(5));
        dynamicArray.remove(5);
        dynamicArray.remove(5);
        dynamicArray.remove(5);
        dynamicArray.remove(5);
        System.out.println(dynamicArray.get(5));
        for (int i = 0; i < dynamicArray.counter; i++) {
            System.out.println(i);
        }
    }
}
