package ru.javaprojects.thinkinginjava.chapter3.exercise11;

public class BitShifting {
    public static void main(String[] args) {
        byte a = 0b100000;
        for (int i = 1; i < 6; i++) {
            int x = a >> i;
            System.out.println(Integer.toBinaryString(x));
        }
    }
}
