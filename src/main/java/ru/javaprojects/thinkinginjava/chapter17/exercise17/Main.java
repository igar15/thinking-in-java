package ru.javaprojects.thinkinginjava.chapter17.exercise17;

import ru.javaprojects.thinkinginjava.chapter17.exercise15.SlowMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new SlowMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue("one"));
        System.out.println(map.remove("1"));
        System.out.println(map);
    }
}
