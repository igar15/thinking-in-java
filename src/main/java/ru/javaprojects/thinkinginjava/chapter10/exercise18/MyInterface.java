package ru.javaprojects.thinkinginjava.chapter10.exercise18;

public interface MyInterface {

    void doSm();

    class Inner implements MyInterface {
        @Override
        public void doSm() {
            System.out.println("123");
        }
    }
}
