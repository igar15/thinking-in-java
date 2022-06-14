package ru.javaprojects.thinkinginjava.chapter17.exercise15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter17\\exercise13\\text.txt");
        List<String> lines = Files.readAllLines(path);
        List<String> words = getWords(lines);
        Map<String, Integer> slowMap = new SlowMap<>();
        for (String word : words) {
            slowMap.merge(word, 1, Integer::sum);
        }
        System.out.println(slowMap);
    }

    private static List<String> getWords(List<String> lines) {
        return lines.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(word -> word.replaceAll("\\p{Punct}", ""))
                .collect(Collectors.toList());
    }
}
