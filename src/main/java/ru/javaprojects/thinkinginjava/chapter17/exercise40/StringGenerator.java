package ru.javaprojects.thinkinginjava.chapter17.exercise40;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.util.Random;

public class StringGenerator implements Generator<String> {
    private static char[] chars = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E'};
    private Random random = new Random();

    @Override
    public String next() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(chars[random.nextInt(chars.length)]);
        }
        return stringBuilder.toString();
    }
}
