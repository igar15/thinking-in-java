package ru.javaprojects.thinkinginjava.chapter18.exercise30;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise30\\shapes.out");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Circle circle = (Circle) ois.readObject();
            circle.deserializeStatic(ois);
            System.out.println(circle);
            System.out.println(Circle.color);
        }
    }
}
