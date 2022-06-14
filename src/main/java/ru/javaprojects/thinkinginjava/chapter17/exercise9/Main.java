package ru.javaprojects.thinkinginjava.chapter17.exercise9;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Generator<String> stringGenerator = new Generator<>() {
            private String[] parts = {"ab", "cd", "ef", "kr", "th"};
            private Random random = new Random();

            @Override
            public String next() {
                int firstPartIndex = random.nextInt(parts.length);
                int secondPartIndex = random.nextInt(parts.length);
                return parts[firstPartIndex] + parts[secondPartIndex];
            }
        };

        Set<String> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(stringGenerator.next());
        }
        System.out.println(set);
    }
}
