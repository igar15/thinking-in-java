package ru.javaprojects.thinkinginjava.chapter16.exercise13;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;
import ru.javaprojects.thinkinginjava.chapter16.exercise12.CountingGenerator;

public class Main {
    public static void main(String[] args) {
        Generator<Character> generator = new CountingGenerator.Character();
        String s = String.valueOf(new char[]{generator.next(), generator.next(), generator.next()});
        System.out.println(s);
    }
}
