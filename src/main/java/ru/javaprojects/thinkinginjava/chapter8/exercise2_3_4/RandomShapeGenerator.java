package ru.javaprojects.thinkinginjava.chapter8.exercise2_3_4;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random();
    public Shape next() {
        int value = random.nextInt(3);
        if (value == 0) {
            return new Circle();
        } else if (value == 1) {
            return new Square();
        } else {
            return new Triangle();
        }
    }
}
