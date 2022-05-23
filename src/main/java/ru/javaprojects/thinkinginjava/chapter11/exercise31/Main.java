package ru.javaprojects.thinkinginjava.chapter11.exercise31;

public class Main {
    public static void main(String[] args) {
        ShapeGenerator generator = new ShapeGenerator(5);
        for (Shape shape : generator) {
            System.out.println(shape);
        }
    }
}
