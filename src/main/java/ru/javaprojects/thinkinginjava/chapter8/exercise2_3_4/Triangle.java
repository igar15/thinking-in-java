package ru.javaprojects.thinkinginjava.chapter8.exercise2_3_4;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draws");
    }

    @Override
    public void info() {
        System.out.println("Triangle info");
    }
}
