package ru.javaprojects.thinkinginjava.chapter17.exercise32;

import java.util.Arrays;

public class IntContainer {
    private int size = 16;
    private int cursor;
    private int[] ints = new int[size];

    public void add(int e) {
        if (cursor == size) {
            ints = Arrays.copyOf(ints, size * 2);
            size *= 2;
        }
        ints[cursor++] = e;
    }

    public boolean remove(int e) {
        boolean removeResult = false;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                break;
            } else {
                if (ints[i] == e) {
                    removeResult = true;
                    moveArray(i);
                    break;
                }
            }
        }
        return removeResult;
    }

    private void moveArray(int index) {
        for (int i = index; i < ints.length - 1; i++) {
            ints[i] = ints[i + 1];
        }
        cursor--;
        ints[ints.length - 1] = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(ints);
    }
}