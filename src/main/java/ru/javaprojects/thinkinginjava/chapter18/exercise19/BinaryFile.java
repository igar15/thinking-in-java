package ru.javaprojects.thinkinginjava.chapter18.exercise19;

import java.io.*;

public class BinaryFile {
    public static byte[] read(File file) throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(file))) {
            return is.readAllBytes();
        }
    }
}
