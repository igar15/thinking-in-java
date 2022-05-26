package ru.javaprojects.thinkinginjava.chapter13.exercise3;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter formatter;

    public Turtle(String name, PrintStream printStream) {
        this.name = name;
        this.formatter = new Formatter(printStream);
    }

    public void move(int x, int y) {
        formatter.format("Turtle %s now at %d,%d\n", name, x, y);
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle("Jimmy", System.err);
        turtle.move(2, 2);
        turtle.move(3, 2);
        turtle.move(24, 5);
    }
}
