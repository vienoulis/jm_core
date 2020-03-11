package ru.vienoulis.coret_7.part_2.exs_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            Stream<String> stream = reader.lines()
                    .flatMap(s -> Arrays.stream(s.split("[^a-zA-Zа-яА-Я0-9]+")))
                    .map(String::toLowerCase)
                    .sorted();
            List<String> stringList = stream.collect(Collectors.toList());

            List<String> stringList1 = stringList.stream().distinct().sorted((o1, o2) -> {
                if (stringList.stream().filter(o1::equals).count() > stringList.stream().filter(o2::equals).count()) {
                    return -1;
                } else if (stringList.stream().filter(o1::equals).count() < stringList.stream().filter(o2::equals).count()) {
                    return 1;
                } else {
                    return 0;
                }
            }).limit(10)
                    .collect(Collectors.toList());

            stringList1.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
