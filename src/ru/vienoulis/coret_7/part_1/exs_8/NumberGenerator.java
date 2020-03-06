package ru.vienoulis.coret_7.part_1.exs_8;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}
