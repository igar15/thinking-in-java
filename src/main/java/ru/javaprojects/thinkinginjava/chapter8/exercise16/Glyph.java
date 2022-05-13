package ru.javaprojects.thinkinginjava.chapter8.exercise16;

public class Glyph {

    public Glyph() {
        System.out.println("start Glyph cons");
        draw();
        System.out.println("end Glyph cons");
    }

    public void draw() {
        System.out.println("draw in Glyph class");
    }
}
