package ru.javaprojects.thinkinginjava.chapter11.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFeatures {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            integers.add(i);
        }
        System.out.println(integers);
        integers.add(7);
        System.out.println(integers);
        System.out.println(integers.contains(5));
        integers.remove(Integer.valueOf(4));
        System.out.println(integers);
        Integer integer = integers.get(2);
        System.out.println(integer + " index = " + integers.indexOf(integer));
        integers.remove(integer);
        integers.add(3, 99);
        System.out.println(integers);
        List<Integer> sub = integers.subList(1, 4);
        System.out.println(sub);
        System.out.println(integers.containsAll(sub));
        Collections.sort(sub);
        System.out.println(integers.containsAll(sub));
        Collections.shuffle(sub);
        System.out.println(integers.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        System.out.println(sub);
        copy.retainAll(sub);
        System.out.println(copy);
        copy = new ArrayList<>(integers);
        copy.remove(2);
        System.out.println(copy);
        copy.removeAll(sub);
        System.out.println(copy);
        copy.set(1, 14);
        System.out.println(copy);
        copy.addAll(2, sub);
        System.out.println(copy);
        System.out.println(copy.isEmpty());
        copy.clear();
        System.out.println(copy.isEmpty());
        integers.addAll(sub);
        System.out.println(integers);
        Object[] objects = integers.toArray();
        System.out.println(Arrays.toString(objects));
        Integer[] integers1 = integers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers1));
    }
}
