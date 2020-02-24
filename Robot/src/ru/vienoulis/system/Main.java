package ru.vienoulis.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double d = 0.0;
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while (scanner.hasNext()) {
            strings.add(scanner.next());
        }
        scanner.close();
        for (String string : strings) {
            try {
                d += Double.parseDouble(string);
            } catch (NumberFormatException e) {
            }
        }
        System.out.printf("%.6f", d);
    }
}
