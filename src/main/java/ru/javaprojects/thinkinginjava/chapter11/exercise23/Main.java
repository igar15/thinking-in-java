package ru.javaprojects.thinkinginjava.chapter11.exercise23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    private static Map<Integer, Integer> numberCounter = new HashMap<>();
    static {
        fillMap(numberCounter);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            fillMap(map);
            System.out.println(map.equals(numberCounter));
        }
    }

    private static void fillMap(Map<Integer, Integer> map) {
        Random random = new Random(47);
        for (int i = 0; i < 10000; i++) {
            map.merge(random.nextInt(20), 1, Integer::sum);
        }
    }
}
