package ru.javaprojects.thinkinginjava.chapter17.exercise36;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new SlowMap<>();
        map.put("3", "three");
        map.put("1", "one");
        map.put("2", "two");
        System.out.println(map);
    }
}
