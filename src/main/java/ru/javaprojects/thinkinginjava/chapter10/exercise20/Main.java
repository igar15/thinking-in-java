package ru.javaprojects.thinkinginjava.chapter10.exercise20;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
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
