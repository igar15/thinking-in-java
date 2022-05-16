package ru.javaprojects.thinkinginjava.chapter10.exercise5;

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
    }
}
