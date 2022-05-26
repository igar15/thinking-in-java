package ru.javaprojects.thinkinginjava.chapter13.exercise5;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        formatter.format("%-10d\n", 5);
        formatter.format("%-10c\n", 'x');
        formatter.format("%-10b\n", true);
        formatter.format("%-10.3s\n", "dfsdfdsf");
        formatter.format("%-10.2f\n", 100.5268);
        formatter.format("%-10.2e\n", 10.236E14);
        formatter.format("%-10x\n", 0x9);
        formatter.format("%-10h\n", 0xABC14D);
        formatter.format("%-10%");
    }
}
