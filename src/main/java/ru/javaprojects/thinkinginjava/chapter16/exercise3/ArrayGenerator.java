package ru.javaprojects.thinkinginjava.chapter16.exercise3;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
    public static double[][] generateArray(int length, int width, double lowBorder, double upBorder) {
        double[][] array = new double[length][width];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = lowBorder + (upBorder - lowBorder) * random.nextDouble();
            }
        }
        return array;
    }

    public static void printArray(Object[] array) {
        System.out.println(Arrays.deepToString(array));
    }
}
