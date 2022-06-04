package ru.javaprojects.thinkinginjava.chapter16.exercise23;

import ru.javaprojects.thinkinginjava.chapter16.exercise15.Generated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] integers = Generated.generateArray(Integer.class, () -> random.nextInt(100), 20);
        Arrays.sort(integers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}
