package ru.javaprojects.thinkinginjava.chapter16.exercise18;

import ru.javaprojects.thinkinginjava.chapter16.exercise1.BerilliumSphere;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BerilliumSphere[] berilliumSpheres = new BerilliumSphere[10];
        Arrays.fill(berilliumSpheres, new BerilliumSphere());
        BerilliumSphere[] copy = Arrays.copyOf(berilliumSpheres, berilliumSpheres.length);
        System.out.println(Arrays.equals(berilliumSpheres, copy));
        System.out.println(Arrays.toString(copy));
    }
}
