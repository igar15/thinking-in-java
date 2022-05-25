package ru.javaprojects.thinkinginjava.chapter12.exercise24;

public class FailingConstructor {
    public FailingConstructor(int x) throws Exception {
        if (x == 0) {
            throw new Exception("123");
        }
    }

    public void dispose() {
        System.out.println("Dispose");
    }

    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor(5);
            failingConstructor.dispose();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
