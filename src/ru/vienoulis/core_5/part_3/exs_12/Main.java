package ru.vienoulis.core_5.part_3.exs_12;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double d = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {

                d += Double.parseDouble(scanner.next());
            } catch (Exception e){

            }
        }
        scanner.close();
        System.out.printf("%.6f", d);
    }
}
