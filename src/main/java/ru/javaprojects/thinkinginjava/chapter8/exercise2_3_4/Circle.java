package ru.javaprojects.thinkinginjava.chapter8.exercise2_3_4;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draws");
    }

    @Override
    public void info() {
        System.out.println("Circle info");
    }
}
