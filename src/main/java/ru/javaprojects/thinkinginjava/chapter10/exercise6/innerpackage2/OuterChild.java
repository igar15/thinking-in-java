package ru.javaprojects.thinkinginjava.chapter10.exercise6.innerpackage2;

import ru.javaprojects.thinkinginjava.chapter10.exercise6.Outer;
import ru.javaprojects.thinkinginjava.chapter10.exercise6.innerpackage.Example;

public class OuterChild extends Outer {
    public Example getExample() {
        return new Inner();
    }

    public static void main(String[] args) {
        new OuterChild().getExample();
    }
}
