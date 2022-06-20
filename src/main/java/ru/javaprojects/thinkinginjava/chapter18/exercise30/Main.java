package ru.javaprojects.thinkinginjava.chapter18.exercise30;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise30\\shapes.out");
        Circle shape = new Circle(10);
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))) {
            ous.writeObject(shape);
            shape.serializeStatic(ous);
        }
    }
}
