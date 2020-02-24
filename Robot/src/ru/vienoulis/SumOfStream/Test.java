package ru.vienoulis.SumOfStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
         byte[] inputBytes = {0};
         ByteArrayInputStream inputStream = new ByteArrayInputStream(inputBytes);
         ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
         print(inputStream, outputStream);
        byte[] outputBytes = outputStream.toByteArray();
        System.out.println(Arrays.toString(outputBytes));


    }
    public int sumOfStream(InputStream inputStream) throws IOException {
        byte[] b = new byte[1];
        int result = 0;
        while (inputStream.read(b) > 0){
            result += b[0];
        }
        return result;
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        while (( i = inputStream.read()) >= 0){
            byte b = (byte)i;
            if (b % 2 == 0) {
                outputStream.write(i);
            }
        }
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = new char[4];
//        while (reader.ready('r') >= 0){
//            stringBuilder.append(chars);
//        }
        return stringBuilder.toString();

    }
}
