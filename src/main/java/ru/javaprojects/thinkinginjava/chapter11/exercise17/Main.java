package ru.javaprojects.thinkinginjava.chapter11.exercise17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("1", new Gerbil(1));
        gerbilMap.put("2", new Gerbil(2));
        gerbilMap.put("3", new Gerbil(3));

        Iterator<String> keySetIterator = gerbilMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println(key + " -> " + gerbilMap.get(key).hop());
        }
    }
}
