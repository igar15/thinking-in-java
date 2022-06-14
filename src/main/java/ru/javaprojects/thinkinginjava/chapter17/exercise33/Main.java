package ru.javaprojects.thinkinginjava.chapter17.exercise33;

public class Main {
    public static void main(String[] args) {
        FastTraversalLinkedList<String> list = new FastTraversalLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        System.out.println(list);
        list.remove("5");
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
