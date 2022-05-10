package ru.javaprojects.thinkinginjava.chapter5.exercise14;

public class StaticInit {
    private static String s1 = "s1";
    private static String s2;

    static {
        s2 = "s2";
    }

    public static void printS() {
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        printS();
    }
}
