package ru.javaprojects.thinkinginjava.chapter16.exercise14;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;
import ru.javaprojects.thinkinginjava.chapter16.exercise12.CountingGenerator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = new byte[10];
        int[] ints = new int[10];
        double[] doubles = new double[10];
        char[] chars = new char[10];
        boolean[] booleans = new boolean[10];
        Generator<Byte> byteGenerator = new CountingGenerator.Byte();
        Generator<Integer> integerGenerator = new CountingGenerator.Integer();
        Generator<Double> doubleGenerator = new CountingGenerator.Double();
        Generator<Character> characterGenerator = new CountingGenerator.Character();
        Generator<Boolean> booleanGenerator = new CountingGenerator.Boolean();
        for (int i = 0; i < 10; i++) {
            bytes[i] = byteGenerator.next();
            ints[i] = integerGenerator.next();
            doubles[i] = doubleGenerator.next();
            chars[i] = characterGenerator.next();
            booleans[i] = booleanGenerator.next();
        }
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(booleans));
    }


}
