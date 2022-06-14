package ru.javaprojects.thinkinginjava.chapter17.exercise19;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> simpleHashMap = new SimpleHashMap<>();
        simpleHashMap.put("1", "One");
        simpleHashMap.put("2", "Two");
        simpleHashMap.put("3", "Three");
        System.out.println(simpleHashMap.get("2"));
        System.out.println(simpleHashMap.entrySet());
    }
}
