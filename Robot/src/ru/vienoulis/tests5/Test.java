package ru.vienoulis.core_5;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {

    }
    public int sumOfStream(InputStream inputStream) throws IOException {
        int i;
        byte result = 0;
        while ((i = inputStream.read()) != -1){
            result += (byte)i;
        }
        return result;
    }

}
