package ru.javaprojects.thinkinginjava.chapter17.exercise12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        fillAndPrintMap(map);
        map = new TreeMap<>();
        fillAndPrintMap(map);
        map = new LinkedHashMap<>();
        fillAndPrintMap(map);
    }

    private static void fillAndPrintMap(Map<String, String> map) {
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        System.out.println(map);
    }
}
