package ru.javaprojects.thinkinginjava.chapter10.exercise9;

public class Main {
    public static void main(String[] args) {
        MyInterface anInterface = new Outer().getInterface();
//        Outer.Inner inner = (Outer.Inner) anInterface;
    }
}
