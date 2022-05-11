package ru.javaprojects.thinkinginjava.chapter7.exercise18;

import java.util.Random;

public class Data {
    private static Random random = new Random();
    public static final int X = random.nextInt();
    public final int y = random.nextInt();

    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();
        System.out.println(data1.X == data2.X);
        System.out.println(data1.y);
        System.out.println(data2.y);
    }
}
