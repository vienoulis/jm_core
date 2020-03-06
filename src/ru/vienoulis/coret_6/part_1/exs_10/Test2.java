package ru.vienoulis.coret_6.part_1.exs_10;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> arrayList = createList();
        List<Integer> linkList = new LinkedList<>(arrayList);
        time(arrayList);
        time(linkList);


    }
    public static List<Integer> createList(){
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
    public static void time(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            list.add(9999,i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}

