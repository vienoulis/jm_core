package ru.vienoulis.coret_7.part_2.exs_12;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            List<String> stringList = reader
                    .lines()
                    .flatMap(s -> Arrays.stream(s.split("[^a-zA-Zа-яА-Я0-9]+")))
                    .map(String::toLowerCase)
                    .sorted()

                    .collect(Collectors.toList());
            stringList.stream()
                    .distinct()
                    .sorted((o1, o2) -> Long.compare(stringList
                            .stream()
                            .filter(o2::equals)
                            .count(),
                            stringList.stream()
                            .filter(o1::equals)
                            .count()))
                    .limit(10)
                    .forEach(System.out::println);
        }
    }
}
