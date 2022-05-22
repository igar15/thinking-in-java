package ru.javaprojects.thinkinginjava.chapter11.exercise18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("fsdf", 4);
        map.put("2sdfds", 1);
        map.put("cvcv", 2);
        map.put("12sfdsdf", 3);
        map.put("hjhjhj", 7);
        System.out.println(map);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER));
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        entries.forEach(e -> linkedMap.put(e.getKey(), e.getValue()));
        System.out.println(linkedMap);
    }
}
