package ru.javaprojects.thinkinginjava.chapter11.exercise3;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        sequence.add("a");
        sequence.add("b");
        sequence.add("c");
        sequence.add("d");
        sequence.add("e");
        Selector selector = sequence.selector();
        while (selector.hasNext()) {
            System.out.println(selector.current());
            selector.next();
        }
        Selector reverseSelector = sequence.reverseSelector();
        while (reverseSelector.hasNext()) {
            System.out.println(reverseSelector.current());
            reverseSelector.next();
        }
    }
}
