package ru.javaprojects.thinkinginjava.chapter10.exercise24;

public class MyClass2 extends MyClass.Inner {
    public MyClass2(int x, MyClass myClass) {
        myClass.super(x);
    }
}
