package ru.javaprojects.thinkinginjava.chapter18.exercise19;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = BinaryFile.read(new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\image_copy\\source\\image.jpg"));
        Map<Byte, Integer> byteMap = new HashMap<>();
        for (byte b : bytes) {
            byteMap.merge(b, 1, Integer::sum);
        }
        System.out.println(byteMap);
    }
}
