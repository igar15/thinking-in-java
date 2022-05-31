package ru.javaprojects.thinkinginjava.chapter15.exercise11;

import java.util.HashMap;
import java.util.Map;

public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

    public static <T> Holder<T> holder() {
        return new Holder<>();
    }
}
