package ru.javaprojects.thinkinginjava.chapter10.exercise2_4;

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        sequence.add("s1");
        sequence.add("s2");
        sequence.add("s3");
        sequence.add("s4");
        sequence.add("s5");
        Selector selector = sequence.getSelector();
        while (selector.hasNext()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
