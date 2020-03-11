package ru.vienoulis.coret_6.part_1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Gen<Object> gen = new Gen();
        System.out.println(integerList.getClass());
        gen.m(integerList);


    }
    static class Gen<T> {

        <T> void m(List<String> list) {
            for (String s : list) {
                System.out.println(s);
            }
        }
        <T> void m(Collection<T> collection) {
            for (T s : collection) {
                System.out.println(s);
            }
        }

    }

}
