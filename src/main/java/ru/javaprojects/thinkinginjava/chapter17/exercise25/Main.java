package ru.javaprojects.thinkinginjava.chapter17.exercise25;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> simpleHashMap = new SimpleHashMap<>();
        simpleHashMap.put("1", "One");
        simpleHashMap.put("2", "Two");
        simpleHashMap.put("3", "Three");
        System.out.println(simpleHashMap.remove("3"));

        System.out.println(simpleHashMap.get("2"));
        System.out.println(simpleHashMap);
        System.out.println(simpleHashMap.size());
        System.out.println(simpleHashMap.entrySet());
    }
}
