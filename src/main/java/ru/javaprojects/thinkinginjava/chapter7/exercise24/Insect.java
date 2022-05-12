package ru.javaprojects.thinkinginjava.chapter7.exercise24;

public class Insect {
    private static int x1 = printInit("Insect.x1 initialized");
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
