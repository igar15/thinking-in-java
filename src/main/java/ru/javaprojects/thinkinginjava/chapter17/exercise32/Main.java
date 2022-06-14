package ru.javaprojects.thinkinginjava.chapter17.exercise32;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArrayListAddingTime());
        System.out.println(getIntContainerAddingTime());
    }

    private static long getArrayListAddingTime() {
        List<Integer> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            list.add(i);
        }
        for (int i = 99998; i >= 1; i--) {
            list.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long getIntContainerAddingTime() {
        IntContainer intContainer = new IntContainer();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            intContainer.add(i);
        }
        for (int i = 99998; i >= 1; i--) {
            intContainer.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
