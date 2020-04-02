package ru.vienoulis.Car;

import java.io.Closeable;
import java.io.IOException;

public class Car implements AutoCloseable {
 public void drive(){
     System.out.println("Машина поехала.");
 }

    @Override
    public void close() throws IOException {
        System.out.println("Машина закрывается...");
    }
}
