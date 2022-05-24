package ru.javaprojects.thinkinginjava.chapter12.exercise11;

import ru.javaprojects.thinkinginjava.chapter12.exercise9_13.Ex1;
import ru.javaprojects.thinkinginjava.chapter12.exercise9_13.Ex2;

public class Main {
    public static void f() throws Ex2 {
        try {
            g();
        } catch (Ex1 ex1) {
            throw new Ex2(ex1);
        }
    }

    public static void g() throws Ex1 {
        throw new Ex1();
    }

    public static void main(String[] args) throws Ex2 {
        f();
    }
}
