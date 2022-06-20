package ru.javaprojects.thinkinginjava.chapter18.exercise23;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise23\\text.txt");
        try (FileChannel fc = new FileInputStream(file).getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(500);
            fc.read(byteBuffer);
            byteBuffer.flip();
            CharBuffer decode = StandardCharsets.UTF_8.decode(byteBuffer);
            System.out.println(decode);
        }
    }
}
