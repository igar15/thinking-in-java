package ru.javaprojects.thinkinginjava.chapter16.exercise2;

import ru.javaprojects.thinkinginjava.chapter16.exercise1.BerilliumSphere;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSpheres(10)));
    }

    public static BerilliumSphere[] getSpheres(int n) {
        BerilliumSphere[] berilliumSpheres = new BerilliumSphere[n];
        for (int i = 0; i < n; i++) {
            berilliumSpheres[i] = new BerilliumSphere();
        }
        return berilliumSpheres;
    }
}
