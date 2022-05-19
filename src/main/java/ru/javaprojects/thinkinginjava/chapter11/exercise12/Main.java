package ru.javaprojects.thinkinginjava.chapter11.exercise12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> copy = new ArrayList<>(integers);
        ListIterator<Integer> listIterator = integers.listIterator();
        ListIterator<Integer> copyIterator = copy.listIterator(copy.size());
        while (listIterator.hasNext()) {
            Integer value = listIterator.next();
            copyIterator.previous();
            copyIterator.set(value);
        }
        System.out.println(copy);
    }
}
