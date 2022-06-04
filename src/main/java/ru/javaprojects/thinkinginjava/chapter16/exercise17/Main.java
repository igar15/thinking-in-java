package ru.javaprojects.thinkinginjava.chapter16.exercise17;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;
import ru.javaprojects.thinkinginjava.chapter16.exercise15.Generated;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generator<BigDecimal> bigDecimalGenerator = new BigDecGenerator();
        BigDecimal[] bigDecimals = new BigDecimal[10];
        Generated.fillArray(bigDecimals, bigDecimalGenerator);
        System.out.println(Arrays.toString(bigDecimals));

        BigDecimal[] bigDecimals1 = Generated.generateArray(BigDecimal.class, bigDecimalGenerator, 10);
        System.out.println(Arrays.toString(bigDecimals1));
    }
}
