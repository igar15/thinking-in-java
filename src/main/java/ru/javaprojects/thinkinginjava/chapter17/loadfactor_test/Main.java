package ru.javaprojects.thinkinginjava.chapter17.loadfactor_test;

import ru.javaprojects.thinkinginjava.chapter17.exercise27.CountedString;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<CountedString, String> map = new HashMap();
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        map.put(new CountedString("1"), "1");
        System.out.println(map);
    }
}
