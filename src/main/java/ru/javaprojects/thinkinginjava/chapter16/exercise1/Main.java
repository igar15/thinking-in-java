package ru.javaprojects.thinkinginjava.chapter16.exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        doWork({new BerilliumSphere()});
        doWork(new BerilliumSphere[] {new BerilliumSphere(), new BerilliumSphere()});
        BerilliumSphere[] berilliumSpheres = {new BerilliumSphere(), new BerilliumSphere()};
    }

    public static void doWork(BerilliumSphere[] berilliumSpheres) {
        System.out.println(Arrays.toString(berilliumSpheres));
    }
}
