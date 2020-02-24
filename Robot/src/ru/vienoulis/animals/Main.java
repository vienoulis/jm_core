package ru.vienoulis.animals;

import java.io.*;
import java.util.Arrays;

/*
Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal.
Массив байт устроен следующим образом. Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size).
Далее подряд записано указанное количество объектов типа Animal, сериализованных при помощи ObjectOutputStream.writeObject(animal).
Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить исключение java.lang.IllegalArgumentException.
Причины некорректности могут быть разные.
Попробуйте подать на вход методу разные некорректные данные и посмотрите, какие исключения будут возникать.
Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то проверяющая система подскажет.
 Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Serialization");
        byte[] bytes = serialization();
        System.out.println("After serialization");
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(deserializeAnimalArray(bytes)));
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
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            i = objectInputStream.readInt();
            animals = new Animal[i];
            for (int j = 0; j < i; j++) {
                animals[j] = (Animal) objectInputStream.readObject();
                if (animals[j] == null) {
                    throw new IllegalArgumentException();
                }
            }
            return animals;
        } catch (NegativeArraySizeException | ClassNotFoundException | ClassCastException | EOFException e) {
            throw new IllegalArgumentException();
        }

    }
}
