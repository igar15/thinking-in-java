package ru.javaprojects.thinkinginjava.chapter17.exercise39;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new SimpleHashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, "");
        }
        System.out.println(map.size());
    }
}
