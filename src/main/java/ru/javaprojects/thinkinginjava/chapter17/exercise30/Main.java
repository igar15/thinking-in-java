package ru.javaprojects.thinkinginjava.chapter17.exercise30;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = createFilledList(ArrayList.class);
        System.out.println(getSortTime(arrayList));
        List<Integer> linkedList = createFilledList(LinkedList.class);
        System.out.println(getSortTime(linkedList));

    }

    private static long getSortTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Collections.sort(list);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static List<Integer> createFilledList(Class<? extends List> type) {
        List<Integer> list = createList(type);
        Random random = new Random(47);
        for (int i = 0; i < 10000000; i++) {
            list.add(random.nextInt(1000000));
        }
        return list;
    }

    private static List<Integer> createList(Class<? extends List> type) {
        try {
           return type.getConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
