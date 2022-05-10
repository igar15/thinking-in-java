package ru.javaprojects.thinkinginjava.chapter5.exercise15;

public class NoStaticTest {
    private String s;
    {
        s = "s";
    }

    public static void main(String[] args) {
        System.out.println(new NoStaticTest().s);
    }
}
