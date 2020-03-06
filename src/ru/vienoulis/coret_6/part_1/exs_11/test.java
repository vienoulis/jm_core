package ru.vienoulis.coret_6.part_1.exs_11;
/*
Массивы в Java имеют фиксированную длину. Попробуем обойти это ограничение.
Создайте класс DynamicArray, который хранит в себе массив, и имеет методы для добавления void add(T el),
void remove(int index) удаления и извлечения T get(int index) из него элементов,
при переполнении текущего массива, должен создаваться новый, большего размера.

Для возможности работы с различными классами DynamicArray должен быть дженериком.
Для решения задачи можно воспользоваться методами из класса java.util.Arrays.
Импорт этого класса уже объявлен в тестирующей системе. Добавлять его явно не нужно
 */


import java.util.*;

public class test {
    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<>();
        int count = 0;
        while (count < 20) {
            array.add("One " + count);
            count++;
        }
        for (int i = 0; i < array.length(); i++) {
            System.out.println(array.get(i));
        }
        array.remove(7);
        for (int i = 0; i < array.length(); i++) {
            System.out.println(array.get(i));
        }

    }

    public static class DynamicArray<T> {
        LinkedList
        private Object[] objects = new Object[]{};

        public int length() {
            return objects.length;
        }

        public T get(int index) {
            return (T) objects[index];
        }

        public void remove(int index) {
            for (int i = index; i < objects.length; i++) {
                if (i + 1 != objects.length) {
                    objects[i] = objects[i + 1];
                }
            }

            objects[objects.length - 1] = null;
            objects = Arrays.copyOf(objects, objects.length - 1);
        }

        public void add(T el) {
            objects = Arrays.copyOf(objects, objects.length + 1);
            objects[objects.length - 1] = el;

        }

    }
}
