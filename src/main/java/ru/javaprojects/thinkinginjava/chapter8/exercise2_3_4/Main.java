package ru.javaprojects.thinkinginjava.chapter8.exercise2_3_4;

public class Main {
    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = generator.next();
        }
        for (Shape s : shapes) {
            s.draw();
            s.info();
        }
    }
}
