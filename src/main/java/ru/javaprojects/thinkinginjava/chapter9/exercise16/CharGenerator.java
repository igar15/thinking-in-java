package ru.javaprojects.thinkinginjava.chapter9.exercise16;

import java.util.Random;

public class CharGenerator {
    private Random random = new Random();

    public char generate() {
        return (char) (random.nextInt(57) + 65);
    }
}
