package ru.javaprojects.thinkinginjava.chapter15.exercise4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Sequence<String> sequence = new Sequence<>(3);
        sequence.add("1");
        sequence.add("2");
        sequence.add("3");
        System.out.println(sequence.add("4"));
        System.out.println(sequence);
        Iterator<String> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------");
        for (String s : sequence) {
            System.out.println(s);
        }
    }
}
