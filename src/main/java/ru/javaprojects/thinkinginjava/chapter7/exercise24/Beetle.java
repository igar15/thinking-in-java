package ru.javaprojects.thinkinginjava.chapter7.exercise24;

public class Beetle extends Insect {
    private static int x2 = printInit("Beetle.x2 initialized");
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
}
