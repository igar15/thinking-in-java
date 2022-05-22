package ru.javaprojects.thinkinginjava.chapter11.exercise19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("sdfdf", "dfdsf", "asdsa", "gfdgdfg"));
        System.out.println(set);
        List<String> list = new ArrayList<>(set);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
