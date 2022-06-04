package ru.javaprojects.thinkinginjava.chapter16.exercise17;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.math.BigDecimal;
import java.util.Random;

public class BigDecGenerator implements Generator<BigDecimal> {
    private Random random = new Random();

    @Override
    public BigDecimal next() {
        return BigDecimal.valueOf(random.nextLong());
    }
}
