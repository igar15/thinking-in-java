package ru.javaprojects.thinkinginjava.chapter11.exercise26;

import ru.javaprojects.thinkinginjava.chapter11.exercise20.WordReader;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        WordReader wordReader = new WordReader("src/main/java/ru/javaprojects/thinkinginjava/chapter11/exercise20/words.txt");
        List<String> words = wordReader.getWords();
        Map<String, List<Integer>> wordIndexing = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            List<Integer> indexes = wordIndexing.get(words.get(i));
            if (indexes == null) {
                wordIndexing.put(words.get(i), new ArrayList<>(Collections.singletonList(i)));
            } else {
                indexes.add(i);
            }
        }

        int maxIndex = wordIndexing.values().stream()
                .flatMap(Collection::stream)
                .max(Comparator.comparingInt(i -> i)).get();


        String[] array = new String[maxIndex + 1];
        Arrays.fill(array, "");
        List<String> content = new ArrayList<>(Arrays.asList(array));
        wordIndexing.forEach((k, v) -> {
            for (int index : v) {
                content.set(index, k);
            }
        });
        String source = String.join(" ", content);
        System.out.println(source);
    }
}
