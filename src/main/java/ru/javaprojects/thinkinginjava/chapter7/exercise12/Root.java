package ru.javaprojects.thinkinginjava.chapter7.exercise12;

public class Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Root(Component1 component1, Component2 component2, Component3 component3) {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
    }

    public void dispose() {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        System.out.println("root dispose");
    }
}
