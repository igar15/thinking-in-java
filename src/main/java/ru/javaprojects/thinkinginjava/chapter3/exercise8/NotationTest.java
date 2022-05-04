package ru.javaprojects.thinkinginjava.chapter3.exercise8;

public class NotationTest {
    public static void main(String[] args) {
        long a = 0xA;
        long b = 012;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));
    }
}
