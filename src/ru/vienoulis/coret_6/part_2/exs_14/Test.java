package ru.vienoulis.coret_6.part_2.exs_14;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

// 1 2 3 4 5 6 7 8 9 10
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (++count % 2 == 0) {
                list.add(i);
            }
        }
        Collections.reverse(list);
        for (Integer i :list) {
            System.out.printf("%d ", i);
        }
    }
}
