package ru.javaprojects.thinkinginjava.chapter17.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionInitializer {
    public static void fillCollection(Collection<String> collection, Path filePath) throws IOException {
        List<String> strings = Files.readAllLines(filePath);
        strings.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .forEach(collection::add);
    }
}
