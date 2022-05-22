package ru.javaprojects.thinkinginjava.chapter11.exercise20;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'A', 'E', 'I', 'O'));
        WordReader wordReader = new WordReader("src/main/java/ru/javaprojects/thinkinginjava/chapter11/exercise20/words.txt");
        List<String> words = wordReader.getWords();
        Map<Character, Long> charCounter = words.stream()
                .flatMapToInt(String::chars)
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(charCounter);
    }
}
