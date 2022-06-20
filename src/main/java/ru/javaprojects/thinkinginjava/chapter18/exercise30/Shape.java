package ru.javaprojects.thinkinginjava.chapter18.exercise30;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private int square;

    public Shape(int square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", square=" + square;
    }
}
