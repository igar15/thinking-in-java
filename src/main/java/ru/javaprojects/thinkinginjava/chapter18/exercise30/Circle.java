package ru.javaprojects.thinkinginjava.chapter18.exercise30;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Circle extends Shape {
    public static String color;

    public Circle(int square) {
        super(square);
        color = "RED";
    }

    public void serializeStatic(ObjectOutputStream outputStream) throws IOException {
        outputStream.writeObject(color);
    }

    public void deserializeStatic(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        color = (String) objectInputStream.readObject();
    }
}
