package ru.javaprojects.thinkinginjava.chapter10.exercise14;

public class Main {
    public static void main(String[] args) {
        Apply.process(new Processor() {
            @Override
            public Object process(Object input) {
                return new CharSwapper().swap((String) input);
            }
        }, "abcd");
    }
}
