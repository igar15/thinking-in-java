package ru.javaprojects.thinkinginjava.chapter10.exercise1_3.innerpackage;

import ru.javaprojects.thinkinginjava.chapter10.exercise1_3.Outer;

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer("123").getInner();
        inner = new Outer("123").new Inner();
        System.out.println(inner);
//        inner = new Outer.Inner(); // need an object of outer class to construct object of inner class
    }
}
