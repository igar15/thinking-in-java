package ru.javaprojects.thinkinginjava.chapter17.exercise4;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        Path filePath = Path.of("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter17\\exercise4\\words.txt");
        CollectionInitializer.fillCollection(words, filePath);
        System.out.println(words);
    }
}
