package ru.javaprojects.thinkinginjava.chapter10.exercise10_11;

public class MyClass {
    public MyInterface getImpl() {
        return new MyInterface() {
            @Override
            public void doSm() {
                System.out.println(123);
            }
        };
    }
}