package ru.vienoulis.core_5.part_2.exs_7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Tests {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[]{1, 2, 4, 10};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println(new Tests().sumOfStream(inputStream));


    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int i;
        int result = 0;
        while ((i = inputStream.read()) != -1) {
            result += (byte) i;
        }
        return result;
    }
}
