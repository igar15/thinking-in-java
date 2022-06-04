package ru.javaprojects.thinkinginjava.chapter16.exercise20;


import ru.javaprojects.thinkinginjava.chapter16.exercise19.Data;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Data[][] data1 = new Data[][] {
                {new Data(3), new Data(3)},
                {new Data(3), new Data(3)},
                {new Data(3), new Data(3)}
        };
        Data[][] data2 = new Data[][] {
                {new Data(3), new Data(3)},
                {new Data(3), new Data(3)},
                {new Data(3), new Data(3)}
        };
        System.out.println(Arrays.deepEquals(data1, data2));
        data2[1][1] = new Data(2);
        System.out.println(Arrays.deepEquals(data1, data2));
    }
}
