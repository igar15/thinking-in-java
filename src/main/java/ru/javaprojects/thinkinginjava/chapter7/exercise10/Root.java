package ru.javaprojects.thinkinginjava.chapter7.exercise10;

import ru.javaprojects.thinkinginjava.chapter7.exercise9.Component1;
import ru.javaprojects.thinkinginjava.chapter7.exercise9.Component2;
import ru.javaprojects.thinkinginjava.chapter7.exercise9.Component3;

public class Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Root(Component1 component1, Component2 component2, Component3 component3) {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
    }
}
