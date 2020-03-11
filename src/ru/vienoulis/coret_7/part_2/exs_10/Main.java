package ru.vienoulis.coret_7.part_2.exs_10;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        pseudoRandomStream(13)
                .limit(20)
                .forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> (((x * x) / 10) % 1000));
    }
}
