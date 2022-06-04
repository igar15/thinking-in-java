package ru.javaprojects.thinkinginjava.chapter16.exercise7;

import ru.javaprojects.thinkinginjava.chapter16.exercise1.BerilliumSphere;

import java.util.Arrays;

public class ArrayGenerator {
    public static BerilliumSphere[][][] getArray(int length, int width, int width3d) {
        BerilliumSphere[][][] berilliumSpheres = new BerilliumSphere[length][width][width3d];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < berilliumSpheres[i].length; j++) {
                for (int k = 0; k < berilliumSpheres[i][j].length; k++) {
                    berilliumSpheres[i][j][k] = new BerilliumSphere();
                }
            }
        }
        return berilliumSpheres;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getArray(3, 2, 2)));
    }
}
