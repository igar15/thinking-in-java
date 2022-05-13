package ru.javaprojects.thinkinginjava.chapter9.exercise11;

public class CharSwapper {
    public String swap(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        return String.valueOf(chars);
    }
}
