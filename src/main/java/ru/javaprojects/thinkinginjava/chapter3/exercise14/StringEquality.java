package ru.javaprojects.thinkinginjava.chapter3.exercise14;

public class StringEquality {
    public static void doEqual(String s1, String s2) {
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("==: " + (s1 == s2));
        System.out.println("!=: " + (s1 != s2));
    }

    public static void main(String[] args) {
        doEqual("aaa", "bbb");
        doEqual("aaa", "aaa");
        doEqual("aaa", new String("aaa"));
    }
}
