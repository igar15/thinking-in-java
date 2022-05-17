package ru.javaprojects.thinkinginjava.chapter10.exercise19;

public class Main {
    public static void main(String[] args) {
        MyInterface.Inner.doSm(() -> System.out.println("123"));
    }
}
