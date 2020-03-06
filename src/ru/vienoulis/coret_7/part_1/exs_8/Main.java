package ru.vienoulis.coret_7.part_1.exs_8;

public class Main {
    public static NumberGenerator<? super Number> getGenerator(){
        return (NumberGenerator<Number>) arg -> arg.intValue() >= 0;
    }

}
