package ru.vienoulis.coret_7.part_1.exs_9;

import java.io.File;
import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
        System.out.println(safeStringLength);


//        List<Integer> list = Arrays.asList(1, 2, 12, 5, 21, 2, 12);
//        list.replaceAll();
//        list.stream().filter((s)-> s > 10).forEach(System.out:: println);
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return (t) -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

    }
}
