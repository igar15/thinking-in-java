package ru.javaprojects.thinkinginjava.chapter10.exercise7;

public class SomeClass2 {
    public SomeInterface getInterface() {
        class Inner implements SomeInterface{
            @Override
            public void doSomething() {
                System.out.println("123");
            }
        }
        return new Inner();
    }

    public SomeInterface getInterface2() {
        if (true) {
            class Inner implements SomeInterface {
                @Override
                public void doSomething() {
                    System.out.println("456");
                }
            }
            return new Inner();
        } else {
            class Inner implements SomeInterface {
                @Override
                public void doSomething() {
                    System.out.println("789");
                }
            }
            return new Inner();
        }
    }
}