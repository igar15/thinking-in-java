package ru.javaprojects.thinkinginjava.chapter15.exercise26;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Number[] numbers = new Integer[3];
        numbers[0] = 10;
        numbers = getArray(Double.class);
        numbers[0] = 10.5;
        System.out.println(Arrays.toString(numbers));
    }

    public static Number[] getArray(Class<? extends Number> clazz) {
        return (Number[]) Array.newInstance(clazz, 10);
    }
}
