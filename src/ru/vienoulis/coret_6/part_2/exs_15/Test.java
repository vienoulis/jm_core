package ru.vienoulis.coret_6.part_2.exs_15;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader(new File("test.txt"));
        Map<String, Long> map = getSalesMap(reader);
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, Long> getSalesMap1(Reader reader) throws IOException {
        Map<String, Long> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        String[] strings;
        int symbol;

        while ((symbol = reader.read()) != -1) {
            builder.append((char) symbol);
        }
        strings = builder.toString()
                .replaceAll("[^a-zA-Z0-9а-яА-Я=,]", "")
                .split("[, =]");
        for (int i = 0; i < strings.length - 1; i += 2) {
            String kay = strings[i];
            long value = Long.parseLong(strings[i + 1]);
            if (map.containsKey(kay)) {
                map.put(kay, value + map.get(kay));
            } else {
                map.put(kay, value);
            }
        }
        return map;
    }

    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Map<String, Long> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        String kay = "a";
        long value;
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.matches("\\W+")) {
                kay = s;
            } else if (s.matches("\\d+")) {
                value = Long.parseLong(s);
                map.merge(kay, value, Long::sum);
            }
        }
        return map;
    }
}
