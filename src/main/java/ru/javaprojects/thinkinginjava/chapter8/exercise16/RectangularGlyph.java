package ru.javaprojects.thinkinginjava.chapter8.exercise16;

public class RectangularGlyph extends Glyph {
    private int square = 10;

    public RectangularGlyph(int square) {
        this.square = square;
        draw();
    }

    @Override
    public void draw() {
        System.out.println("Rectangular square = " + square);
    }

    public static void main(String[] args) {
        new RectangularGlyph(50);
    }
}
