package ru.javaprojects.thinkinginjava.chapter16.exercise16;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

public class Main {
    public static void main(String[] args) {
        Generator<Double> generator1 = new SkipGenerator.Double(3);
        Generator<Character> generator2 = new SkipGenerator.Character(200);
        for (int i = 0; i < 10; i++) {
            System.out.println(generator1.next());
            System.out.println(generator2.next());
        }
    }
}
