package ru.vienoulis.core_5.part_3.exs_11;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter stringWriter = new StringWriter();
        int i;
        while ((i = reader.read()) >= 0) {
            stringWriter.append((char) i);
        }
        return stringWriter.toString();
    }
}
