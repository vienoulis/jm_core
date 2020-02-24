package ru.vienoulis.serial;

import java.io.*;

public class Seri {
    public static void main(String[] args) {


        Tail tail = new Tail(9);
        Animal animal = new Animal(9, tail, "Barsic");
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Animals.bin"));
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Animals.bin"));
            outputStream.writeObject(animal);
            Animal newAnimal = (Animal) inputStream.readObject();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
