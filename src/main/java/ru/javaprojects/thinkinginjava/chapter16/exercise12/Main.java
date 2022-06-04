package ru.javaprojects.thinkinginjava.chapter16.exercise12;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generator<Double> generator = new CountingGenerator.Double();
        double[] doubles = {generator.next(), generator.next()};
        System.out.println(Arrays.toString(doubles));
    }
}
