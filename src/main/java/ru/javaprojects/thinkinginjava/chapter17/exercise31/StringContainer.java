package ru.javaprojects.thinkinginjava.chapter17.exercise31;

import java.util.Arrays;

public class StringContainer {
    private int size = 16;
    private int cursor;
    private String[] strings = new String[size];

    public void add(String s) {
        if (cursor == size) {
            strings = Arrays.copyOf(strings, size * 2);
            size *= 2;
        }
        strings[cursor++] = s;
    }

    public boolean remove(String s) {
        boolean removeResult = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                break;
            } else {
                if (strings[i].equals(s)) {
                    removeResult = true;
                    moveArray(i);
                    break;
                }
            }
        }
        return removeResult;
    }

    private void moveArray(int index) {
        for (int i = index; i < strings.length - 1; i++) {
            strings[i] = strings[i + 1];
        }
        cursor--;
        strings[strings.length - 1] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }
}