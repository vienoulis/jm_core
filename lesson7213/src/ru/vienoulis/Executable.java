package ru.vienoulis;

public interface Executable<T> {
    T getContent();
    String getTo();
    String getFrom();
}
