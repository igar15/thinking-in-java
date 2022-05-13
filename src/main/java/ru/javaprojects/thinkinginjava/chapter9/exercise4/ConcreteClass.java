package ru.javaprojects.thinkinginjava.chapter9.exercise4;

public class ConcreteClass extends AbsClass {

    public static void staticDoSomething(AbsClass absClass) {
        absClass.doSomething();
    }

    public void doSomething() {
        System.out.println("123");
    }

    public static void main(String[] args) {
        staticDoSomething(new ConcreteClass());
    }
}
