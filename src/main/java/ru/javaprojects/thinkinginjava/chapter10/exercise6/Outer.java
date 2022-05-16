package ru.javaprojects.thinkinginjava.chapter10.exercise6;

import ru.javaprojects.thinkinginjava.chapter10.exercise6.innerpackage.Example;

public class Outer {

    protected class Inner implements Example {

        public Inner() {

        }

        @Override
        public void doSomething() {
            System.out.println("123");
        }
    }

}
