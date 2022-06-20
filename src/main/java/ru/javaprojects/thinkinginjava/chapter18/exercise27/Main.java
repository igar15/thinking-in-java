package ru.javaprojects.thinkinginjava.chapter18.exercise27;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Data data = new Data("my data");
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise27\\objects.out");
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))) {
            ous.writeObject(data);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Data fileData = (Data) ois.readObject();
            System.out.println(fileData);
        }

    }
}
