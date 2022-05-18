package ru.javaprojects.thinkinginjava.chapter11.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFeatures {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            strings.add(i + "");
        }
        System.out.println(strings);
        strings.add("7");
        System.out.println(strings);
        System.out.println(strings.contains("5"));
        strings.remove("4");
        System.out.println(strings);
        String s = strings.get(2);
        System.out.println(s + " index = " + strings.indexOf(s));
        strings.remove(s);
        strings.add(3, "99");
        System.out.println(strings);
        List<String> sub = strings.subList(1, 4);
        System.out.println(sub);
        System.out.println(strings.containsAll(sub));
        Collections.sort(sub);
        System.out.println(strings.containsAll(sub));
        Collections.shuffle(sub);
        System.out.println(strings.containsAll(sub));
        List<String> copy = new ArrayList<>(strings);
        sub = Arrays.asList(strings.get(1), strings.get(4));
        System.out.println(sub);
        copy.retainAll(sub);
        System.out.println(copy);
        copy = new ArrayList<>(strings);
        copy.remove(2);
        System.out.println(copy);
        copy.removeAll(sub);
        System.out.println(copy);
        copy.set(1, "14");
        System.out.println(copy);
        copy.addAll(2, sub);
        System.out.println(copy);
        System.out.println(copy.isEmpty());
        copy.clear();
        System.out.println(copy.isEmpty());
        strings.addAll(sub);
        System.out.println(strings);
        Object[] objects = strings.toArray();
        System.out.println(Arrays.toString(objects));
        String[] strings1 = strings.toArray(new String[0]);
        System.out.println(Arrays.toString(strings1));
    }
}
