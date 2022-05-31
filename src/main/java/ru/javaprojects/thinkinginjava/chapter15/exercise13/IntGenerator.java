package ru.javaprojects.thinkinginjava.chapter15.exercise13;

import java.util.Random;

public class IntGenerator implements Generator<Integer> {
    private final Random random = new Random();
    private final int border;

    public IntGenerator(int border) {
        this.border = border;
    }

    @Override
    public Integer next() {
        return random.nextInt(border);
    }
}
