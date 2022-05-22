package ru.javaprojects.thinkinginjava.chapter11.exercise20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordReader {
    private final String fileName;

    public WordReader(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getWords() throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));
        return lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .collect(Collectors.toList());
    }
}
