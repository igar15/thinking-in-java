package ru.javaprojects.thinkinginjava.chapter16.exercise24;

import ru.javaprojects.thinkinginjava.chapter16.exercise15.Generated;
import ru.javaprojects.thinkinginjava.chapter16.exercise19.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Data[] datas = Generated.generateArray(Data.class, () -> new Data(random.nextInt(100)), 20);
        Arrays.sort(datas, Comparator.comparingInt(Data::getValue));
        System.out.println(Arrays.toString(datas));
        int i = Arrays.binarySearch(datas, datas[17], Comparator.comparingInt(Data::getValue));
        System.out.println(i);
    }
}
