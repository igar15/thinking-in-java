package ru.javaprojects.thinkinginjava.chapter4.exercise21;

public class CycleBreake {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 99) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i == 99) {
                return;
            }
            System.out.println(i);
        }
    }
}
