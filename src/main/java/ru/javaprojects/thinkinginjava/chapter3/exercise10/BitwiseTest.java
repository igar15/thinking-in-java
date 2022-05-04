package ru.javaprojects.thinkinginjava.chapter3.exercise10;

public class BitwiseTest {
    public static void main(String[] args) {
        byte a = 0b1010;
        byte b = 0b0110;
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
    }
}
