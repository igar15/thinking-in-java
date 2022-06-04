package ru.javaprojects.thinkinginjava.chapter16.exercise6;

import ru.javaprojects.thinkinginjava.chapter16.exercise1.BerilliumSphere;

import java.util.Arrays;

public class ArrayGenerator {
    public static BerilliumSphere[][] getArray(int length, int width) {
        BerilliumSphere[][] berilliumSpheres = new BerilliumSphere[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < berilliumSpheres[i].length; j++) {
                berilliumSpheres[i][j] = new BerilliumSphere();
            }
        }
        return berilliumSpheres;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getArray(3, 2)));
    }
}
