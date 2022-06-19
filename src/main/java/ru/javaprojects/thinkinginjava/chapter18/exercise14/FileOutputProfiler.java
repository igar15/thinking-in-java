package ru.javaprojects.thinkinginjava.chapter18.exercise14;

import java.io.*;
import java.util.Arrays;

public class FileOutputProfiler {
    private byte[] data;

    public FileOutputProfiler() {
        data = fillData();
    }

    private byte[] fillData() {
        byte[] data = new byte[10000];
        Arrays.fill(data, (byte) 50);
        return data;
    }

    public long timeWithoutBuffer() throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise14" + "\\out.txt");
        long start = System.currentTimeMillis();
        try (OutputStream os = new FileOutputStream(file)) {
            for (int i = 0; i < data.length; i++) {
                os.write(data[i]);
            }
        }
        return System.currentTimeMillis() - start;
    }

    public long timeWithBuffer() throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise14" + "\\out.txt");
        long start = System.currentTimeMillis();
        try (OutputStream os = new BufferedOutputStream(new FileOutputStream(file))) {
            os.write(data);
        }
        return System.currentTimeMillis() - start;
    }


}
