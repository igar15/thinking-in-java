package ru.javaprojects.thinkinginjava.chapter17.exercise28;

public class Main {
    public static void main(String[] args) {
        Tuple<String, Integer> tuple1 = new Tuple<>("1", 1);
        Tuple<String, Integer> tuple2 = new Tuple<>("1", 2);
        System.out.println(tuple1.compareTo(tuple2));
    }
}
