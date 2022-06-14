package ru.javaprojects.thinkinginjava.chapter17.exercise16;

import ru.javaprojects.thinkinginjava.chapter17.exercise15.SlowMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new SlowMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        System.out.println(map.entrySet());
        System.out.println(map);
        System.out.println(map.isEmpty());
        map.entrySet().removeAll(map.entrySet());
        System.out.println(map.isEmpty());
    }
}
