package ru.javaprojects.thinkinginjava.chapter10.exercise20;

public interface Selector {
    boolean hasNext();
    Object current();
    void next();
}
