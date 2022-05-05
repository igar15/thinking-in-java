package ru.javaprojects.thinkinginjava.chapter5.exercise11;

public class ClassWithFinalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("in finalize body");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new ClassWithFinalize();
        }
    }
}
