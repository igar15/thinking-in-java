package ru.javaprojects.thinkinginjava.chapter10.exercise2_4;

public interface Selector {
    boolean hasNext();
    Object current();
    void next();
}
