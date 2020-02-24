package ru.vienoulis.core_5.part_2.exs_7;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{3, 10, 4, 5, 7};
        try (InputStream inputStream = new ByteArrayInputStream(bytes);
             OutputStream outputStream = new BufferedOutputStream(new ByteArrayOutputStream())) {
            print(inputStream, outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        while ((i = inputStream.read()) >= 0) {
            if ((byte) i % 2 == 0) {
                outputStream.write((byte) i);
            }
        }
    }
}
