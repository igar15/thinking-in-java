package ru.javaprojects.thinkinginjava.chapter11.exercise14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ListIterator<Integer> listIterator = integers.listIterator(integers.size() / 2);
            listIterator.add(i);
        }
        System.out.println(integers);
    }
}
