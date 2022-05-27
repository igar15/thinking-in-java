package ru.javaprojects.thinkinginjava.chapter14.exercise3_4_5_6;

public abstract class Shape {
    private boolean selected = false;

    public void draw() {
        System.out.println(this + " draws");
    }

    public void select() {
        selected = true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " selected = " + selected;
    }
}
