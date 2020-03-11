package ru.vienoulis.coret_7.part_2.exs_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream<Integer> stream = IntStream.of(8, 9, 5, 54, 4, 38, 3, 0, 74, 78, 7, 56, 55).boxed();
        Stream<Integer> stream = IntStream.of().boxed();
        Comparator<Integer> comparator = Main::compare;
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + " " + b);
        new Main().findMinMax(stream, comparator, biConsumer);
    }

    private static int compare(Integer a, Integer b) {
        if (a > b) {
            return 1;
        } else if (b > a) {
            return -1;
        } else {
            return 0;
        }
    }
    //        T min = (T) list.stream().min(order).orElse(null);
//        T max = (T) list.stream().max(order).orElse(null);
    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }
    }
}
