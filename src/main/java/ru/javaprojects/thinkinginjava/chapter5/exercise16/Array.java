package ru.javaprojects.thinkinginjava.chapter5.exercise16;

public class Array {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "s1";
        strings[1] = "s2";
        strings[2] = "s3";
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
