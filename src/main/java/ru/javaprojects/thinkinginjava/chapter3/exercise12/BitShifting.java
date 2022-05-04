package ru.javaprojects.thinkinginjava.chapter3.exercise12;

public class BitShifting {
    public static void main(String[] args) {
        byte a = 0b111111;
        int x = a << 1;
        System.out.println(Integer.toBinaryString(x));
        for (int i = 1; i < 8; i++) {
            int y = x >>> i;
            System.out.println(Integer.toBinaryString(y));
        }
    }
}
