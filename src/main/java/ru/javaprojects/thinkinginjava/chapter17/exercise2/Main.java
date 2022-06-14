package ru.javaprojects.thinkinginjava.chapter17.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("America", "Washington");
        countryMap.put("Armenia", "Erevan");
        countryMap.put("Angola", "Kongo");
        System.out.println(countryMap);

        Set<String> countries = countryMap.keySet();
        System.out.println(countries);
    }
}
