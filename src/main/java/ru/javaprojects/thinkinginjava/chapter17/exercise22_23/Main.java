package ru.javaprojects.thinkinginjava.chapter17.exercise22_23;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> simpleHashMap = new SimpleHashMap<>();
        simpleHashMap.put("1", "One");
        simpleHashMap.put("2", "Two");
        simpleHashMap.put("3", "Three");
        System.out.println(simpleHashMap.size());
        System.out.println(simpleHashMap.entrySet());
        System.out.println(simpleHashMap.keySet());
        System.out.println(simpleHashMap.values());
        System.out.println(simpleHashMap.containsKey("1"));
        System.out.println(simpleHashMap.containsValue("One"));
        System.out.println(simpleHashMap);
        simpleHashMap.remove("4");
        System.out.println(simpleHashMap);
        simpleHashMap.remove("1");
        System.out.println(simpleHashMap);
        simpleHashMap.clear();
        System.out.println(simpleHashMap);
    }
}
