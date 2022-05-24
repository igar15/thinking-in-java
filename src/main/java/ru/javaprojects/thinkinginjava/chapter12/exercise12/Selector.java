package ru.javaprojects.thinkinginjava.chapter12.exercise12;

public interface Selector {
    boolean hasNext();
    Object current();
    void next();
}
