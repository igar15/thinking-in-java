package ru.javaprojects.thinkinginjava.chapter17.exercise31;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArrayListAddingTime());
        System.out.println(getStringContainerAddingTime());
    }

    private static long getArrayListAddingTime() {
        List<String> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add("" + i);
        }
        for (int i = 9999; i >= 0; i--) {
            list.remove("" + i);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long getStringContainerAddingTime() {
        StringContainer stringContainer = new StringContainer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringContainer.add("" + i);
        }
        for (int i = 9999; i >= 0; i--) {
            stringContainer.remove("" + i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
