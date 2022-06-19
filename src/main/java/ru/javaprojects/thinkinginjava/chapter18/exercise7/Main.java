package ru.javaprojects.thinkinginjava.chapter18.exercise7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise7\\text.txt");
        LinkedList<String> strings = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
            Iterator<String> stringIterator = strings.descendingIterator();
            while (stringIterator.hasNext()) {
                System.out.println(stringIterator.next());
            }
        }
    }
}
