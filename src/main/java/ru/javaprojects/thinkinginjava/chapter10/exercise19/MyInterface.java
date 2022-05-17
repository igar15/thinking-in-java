package ru.javaprojects.thinkinginjava.chapter10.exercise19;

public interface MyInterface {

    void print();

    class Inner {
        public static void doSm(MyInterface myInterface) {
            myInterface.print();
        }
    }
}
