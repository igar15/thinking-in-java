package ru.javaprojects.thinkinginjava.chapter11.exercise11;

import java.util.*;

public class MyClass {
    public static <T> void traverse(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Set<String> stringSet = new TreeSet<>();
        Queue<String> queue = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String value = random.nextInt(100) + "";
            strings.add(value);
            stringSet.add(value);
            queue.add(value);
        }
        traverse(strings);
        traverse(stringSet);
        traverse(queue);
    }
}
