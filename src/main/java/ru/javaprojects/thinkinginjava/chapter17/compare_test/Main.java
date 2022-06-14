package ru.javaprojects.thinkinginjava.chapter17.compare_test;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(10);
        Data data2 = new Data(20);
        Set<Data> set = new TreeSet<>();
        set.add(data1);
        set.add(data2);
        System.out.println(set);
    }
}
