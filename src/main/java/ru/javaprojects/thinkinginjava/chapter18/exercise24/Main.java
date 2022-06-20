package ru.javaprojects.thinkinginjava.chapter18.exercise24;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class Main {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, 0, 0, 0, 97});
        DoubleBuffer doubleBuffer = byteBuffer.asDoubleBuffer();
        while (doubleBuffer.hasRemaining()) {
            System.out.println(doubleBuffer.position());
            System.out.println(doubleBuffer.get());
        }
    }
}
