package ru.javaprojects.thinkinginjava.chapter10.exercise7;

public class SomeClass {
    private String s;

    private void doSomething() {

    }

    public void doInner() {
        new Inner().changeOuter();
    }

    class Inner {
        void changeOuter() {
            s = "111";
            doSomething();
        }
    }
}
