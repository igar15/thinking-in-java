package ru.javaprojects.thinkinginjava.chapter5.exercise3;

public class NoArgConstructorClass {

    public NoArgConstructorClass() {
        System.out.println("In constructor body");
    }

    public static void main(String[] args) {
        new NoArgConstructorClass();
    }
}
