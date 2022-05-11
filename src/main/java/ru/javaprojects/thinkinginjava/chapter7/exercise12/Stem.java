package ru.javaprojects.thinkinginjava.chapter7.exercise12;

public class Stem extends Root{

    public Stem(Component1 component1, Component2 component2, Component3 component3) {
        super(component1, component2, component3);
    }

    @Override
    public void dispose() {
        System.out.println("stem dispose");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem = new Stem(new Component1(), new Component2(), new Component3());
        stem.dispose();
    }
}
