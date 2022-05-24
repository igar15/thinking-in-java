package ru.javaprojects.thinkinginjava.chapter12.exercise10;

import ru.javaprojects.thinkinginjava.chapter12.exercise9_13.Ex1;
import ru.javaprojects.thinkinginjava.chapter12.exercise9_13.Ex2;

public class MyClass {
    public static void f() throws Ex2 {
        try {
            g();
        } catch (Ex1 ex1) {
            throw new Ex2();
        }
    }

    public static void g() throws Ex1 {
        throw new Ex1();
    }

    public static void main(String[] args) throws Ex2 {
        f();
    }
}
