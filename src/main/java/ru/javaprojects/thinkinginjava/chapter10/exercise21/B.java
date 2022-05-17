package ru.javaprojects.thinkinginjava.chapter10.exercise21;

public class B {
    public static final int CAPACITY = 3;

    private U[] us = new U[CAPACITY];
    private int size = 0;

    public void addU(U u) {
        if (size < CAPACITY) {
            us[size++] = u;
        }
    }

    public void resetU(int index) {
        if (index < CAPACITY) {
            us[index] = null;
        }
    }

    public void iterate() {
        for (U u : us) {
            u.a();
            u.b();
            u.c();
        }
    }
}
