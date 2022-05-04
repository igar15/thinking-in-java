package ru.javaprojects.thinkinginjava.chapter2.exercise6;

public class StringUtil {
    public static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s = "apple";
        System.out.printf("Word \"%s\" takes %d bytes of memory\n", s, storage(s));
    }
}
