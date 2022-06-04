package ru.javaprojects.thinkinginjava.chapter16.exercise21;

import ru.javaprojects.thinkinginjava.chapter16.exercise15.Generated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomData[] randomData = Generated.generateArray(RandomData.class, () -> new RandomData(random.nextInt(100)), 10);
        System.out.println(Arrays.toString(randomData));
        Arrays.sort(randomData);
        System.out.println(Arrays.toString(randomData));
        Arrays.sort(randomData, Comparator.reverseOrder());
        System.out.println(Arrays.toString(randomData));
    }
}
