package ru.vienoulis.coret_7.part_2;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        IntStream intStream = Stream.iterate(0,n -> n +1 )
                .filter(n -> n > 5)
                .mapToInt(Object::hashCode)
                .peek(System.out:: println)
                .limit(10);
        System.out.println(intStream.sum());
    }
}
