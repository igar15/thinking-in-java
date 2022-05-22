package ru.javaprojects.thinkinginjava.chapter11.exercise21;

import ru.javaprojects.thinkinginjava.chapter11.exercise20.WordReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        WordReader wordReader = new WordReader("src/main/java/ru/javaprojects/thinkinginjava/chapter11/exercise20/words.txt");
        List<String> words = wordReader.getWords();

//        Map<String, Integer> wordCounter = new HashMap<>();
//        words.forEach(word -> wordCounter.merge(word, 1, Integer::sum));

        Map<String, Long> wordCounter = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        List<Map.Entry<String, Long>> entries = new ArrayList<>(wordCounter.entrySet());
        entries.sort(Map.Entry.comparingByKey(String.CASE_INSENSITIVE_ORDER));
        entries.forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
    }
}
