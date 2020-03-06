package ru.vienoulis.coret_6.part_1.exs_10;

public class Test {
    public static void main(String[] args) {
        Box<String> stringBox = Box.getBox();
        stringBox.setObject("123sada");
        System.out.println(stringBox.getObject());
    }

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<T>();
        }

        public void setObject(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }
    }

}

