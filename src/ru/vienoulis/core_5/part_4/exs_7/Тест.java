package ru.vienoulis.core_5.part_4.exs_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class Тест {
    public static void main(String[] args) throws IOException {
//        System.out.println("Serialization");
//        byte[] bytes = serialization();
//        System.out.println("After serialization");
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(Arrays.toString(deserializeAnimalArray(bytes)));\
        List<?> list = new ArrayList<>();
//        list.add(null);
        System.out.println(list.get(0));

    }



    public static class Box<T> {
        private T object;

        public Box(T value) {
            this.object = value;
        }

        public static <T> Box<T> getBox(T value) {
            return new Box<T>(value);
        }
    }

    public static byte[] serialization() {
        Animal animal1 = new Animal("Musya 1");
        Animal animal3 = new Animal("Busya 2");
        Animal animal2 = new Animal("Kusya 3");
        Animal[] animals = new Animal[]{animal1, animal2, animal3, null};
        byte[] bytes;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {
            oos.writeInt(animals.length);
            for (Animal a : animals) {

                oos.writeObject(a);
            }
            bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("Output exception");
        }
        return null;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException {
        Animal[] animals;
        int i;
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            i = objectInputStream.readInt();
            animals = new Animal[i];
            for (int j = 0; j < i; j++) {
                animals[j] = (Animal) objectInputStream.readObject();
                System.out.println(animals[j]);
                if (animals[j] == null) {
                    throw new IllegalArgumentException();
                }
            }
        } catch (ClassNotFoundException | EOFException e) {
            throw new IllegalArgumentException();
        }
        return animals;
    }
}
