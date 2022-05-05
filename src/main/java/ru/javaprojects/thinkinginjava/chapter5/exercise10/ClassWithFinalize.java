package ru.javaprojects.thinkinginjava.chapter5.exercise10;

public class ClassWithFinalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("In finalize body");
    }

    public static void main(String[] args) {
        new ClassWithFinalize();
    }
}
