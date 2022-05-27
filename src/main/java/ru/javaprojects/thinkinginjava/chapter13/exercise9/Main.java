package ru.javaprojects.thinkinginjava.chapter13.exercise9;

import static ru.javaprojects.thinkinginjava.chapter13.exercise8.Main.KNIGHTS;

public class Main {
    public static void main(String[] args) {
        String s = KNIGHTS.replaceAll("[aeiouy]", "_");
        System.out.println(s);
    }
}
