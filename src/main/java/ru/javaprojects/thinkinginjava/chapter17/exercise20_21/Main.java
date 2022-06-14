package ru.javaprojects.thinkinginjava.chapter17.exercise20_21;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> simpleHashMap = new SimpleHashMap<>();
        simpleHashMap.put("1", "One");
        simpleHashMap.put("2", "Two");
        simpleHashMap.put("3", "Three");
        simpleHashMap.put("3", "Three");
    }
}
