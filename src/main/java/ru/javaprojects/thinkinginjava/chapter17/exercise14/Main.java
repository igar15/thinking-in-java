package ru.javaprojects.thinkinginjava.chapter17.exercise14;

import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("1", "One");
        properties.put("2", "Two");
        properties.put("3", "Three");
        test(properties);

    }

    public static <K, V> void test(Map<K, V> map) {
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
        map.keySet().removeAll(map.keySet());
        System.out.println(map.isEmpty());
    }
}
