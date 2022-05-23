package ru.javaprojects.thinkinginjava.chapter11.exercise31;

import java.util.Iterator;
import java.util.Random;

public class ShapeGenerator implements Iterable<Shape> {
    private int quantity;
    private Random random = new Random();

    public ShapeGenerator(int quantity) {
        this.quantity = quantity;
    }



    private Shape generate() {
        int value = random.nextInt(2);
        return value == 0 ? new Triangle() : new Circle();
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < quantity;
            }

            @Override
            public Shape next() {
                cursor++;
                return generate();
            }
        };
    }
}
