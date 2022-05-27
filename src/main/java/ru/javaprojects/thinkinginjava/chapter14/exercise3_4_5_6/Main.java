package ru.javaprojects.thinkinginjava.chapter14.exercise3_4_5_6;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rhomboid();
        Rhomboid rhomboid = (Rhomboid) shape;
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
        }
        rotate(shape);
    }

    public static void rotate(Shape shape) {
        if (!(shape instanceof Circle)) {
            System.out.println("Rotating " + shape);
        }
    }
}