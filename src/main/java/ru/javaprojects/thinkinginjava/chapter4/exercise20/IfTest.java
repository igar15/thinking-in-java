package ru.javaprojects.thinkinginjava.chapter4.exercise20;

public class IfTest {
    public static int test(int testval, int target, int begin, int end) {
        if (testval < begin || testval > end) {
            throw new IllegalArgumentException(String.format("testval must be between %d and %d", begin, end));
        }
        if (testval > target) {
            return 1;
        }
        return testval < target ? -1 : 0;
    }
}
