package ru.javaprojects.thinkinginjava.chapter11.exercise4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CharacterGenerator generator = new CharacterGenerator();
        String[] namesArray = new String[10];
        List<String> namesArrayList = new ArrayList<>();
        List<String> namesLinkedList = new LinkedList<>();
        Set<String> namesHashSet = new HashSet<>();
        Set<String> namesLinkedHashSet = new LinkedHashSet<>();
        Set<String> namesTreeSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            String name = generator.next();
            namesArray[i] = name;
            namesArrayList.add(name);
            namesLinkedList.add(name);
            namesHashSet.add(name);
            namesLinkedHashSet.add(name);
            namesTreeSet.add(name);
        }
        System.out.println(Arrays.toString(namesArray));
        System.out.println(namesArrayList);
        System.out.println(namesLinkedList);
        System.out.println(namesHashSet);
        System.out.println(namesLinkedHashSet);
        System.out.println(namesTreeSet);
    }
}
