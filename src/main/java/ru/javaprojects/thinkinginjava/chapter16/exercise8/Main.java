package ru.javaprojects.thinkinginjava.chapter16.exercise8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Holder<String> holder = new Holder<>();
        String[] array = holder.getArray();
        array[0] = "1";
        array[1] = "2";
        System.out.println(Arrays.toString(array));
    }
}
