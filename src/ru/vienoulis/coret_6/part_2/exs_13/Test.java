package ru.vienoulis.coret_6.part_2.exs_13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//[1, 2, 3} и {0, 1, 2]  [0, 3]
public class Test {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(symmetricDifference(set1, set2));
    }
public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> result = new HashSet<>(set1);
    Set<T> values = new HashSet<>(set2);
    result.removeAll(set2);
    values.removeAll(set1);
    result.addAll(values);
    return result;
}
}
