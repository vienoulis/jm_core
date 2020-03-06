package ru.vienoulis.coret_6.part_1.exs_12;

import java.util.Objects;

public /*static*/ class Pair<T, R> {
    private T first;
    private R second;

    private Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    public static <T, R> Pair<T, R> of(T first, R second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public R getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
