package ru.javaprojects.thinkinginjava.chapter7.exercise24;

public class BeetleChild extends Beetle {
    private static int x3 = printInit("BeetleChild.x3 initialized");
    private int m = printInit("BeetleChild.m initialized");

    public BeetleChild() {
        System.out.println("m = " + m);
        System.out.println("j = " + j);
    }
}
