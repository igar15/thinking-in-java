package ru.javaprojects.thinkinginjava.chapter3.exercise13;

public class BitwiseChar {
    public static void printCharAsBits(char c) {
        System.out.println(Integer.toBinaryString(c));
    }

    public static void main(String[] args) {
        printCharAsBits('x');
        printCharAsBits('y');
        printCharAsBits('z');
    }
}
