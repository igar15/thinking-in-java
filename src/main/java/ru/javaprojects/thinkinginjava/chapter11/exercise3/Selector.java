package ru.javaprojects.thinkinginjava.chapter11.exercise3;

public interface Selector {
    boolean hasNext();
    Object current();
    void next();
}
