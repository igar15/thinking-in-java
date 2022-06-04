package ru.javaprojects.thinkinginjava.chapter16.exercise19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Data[] data1 = new Data[]{new Data(3), new Data(3), new Data(3), new Data(3), new Data(3)};
        Data[] data2 = new Data[]{new Data(3), new Data(3), new Data(3), new Data(3), new Data(3)};
        System.out.println(Arrays.equals(data1, data2));
    }
}
