package ru.javaprojects.thinkinginjava.chapter11.exercise9;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        sequence.add("a");
        sequence.add("b");
        sequence.add("c");
        sequence.add("d");
        sequence.add("e");
        Iterator iterator = sequence.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterator reverseIterator = sequence.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
