package ru.javaprojects.thinkinginjava.chapter12.exercise22;

public class FailingConstructor {
    public FailingConstructor(int x) throws Exception {
        if (x == 0) {
            throw new Exception("123");
        }

    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
