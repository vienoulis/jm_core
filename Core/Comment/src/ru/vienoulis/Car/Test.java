package ru.vienoulis.Car;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try (Car car = new Car();){
            car.drive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
