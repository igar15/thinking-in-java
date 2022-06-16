package ru.javaprojects.thinkinginjava.chapter18.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TextFile {
    private Path path;

    public TextFile(String path) {
        this.path = Path.of(path);
    }

    public List<String> getLines() {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
