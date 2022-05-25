package ru.javaprojects.thinkinginjava.chapter12.exercise23;

public class FailingConstructor {
    private Data data;

    public FailingConstructor(int x) throws Exception {
        try {
            data = new Data();
            if (x == 0) {
                throw new Exception("123");
            }
        } finally {
            data.dispose();
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
