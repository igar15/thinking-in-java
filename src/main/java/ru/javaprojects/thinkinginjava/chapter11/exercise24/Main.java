package ru.javaprojects.thinkinginjava.chapter11.exercise24;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("fddsf", "dsfsd");
        map.put("fdsdfdf", "jhjgh");
        map.put("zcxzc", "fdgg");
        map.put("iuiiyuio", "fdg");
        map.put("mjkhjk", "mbmbnm");
        System.out.println(map);
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER));
        list.forEach(e -> map.put(e.getKey(), e.getValue()));
        System.out.println(map);
    }
}
