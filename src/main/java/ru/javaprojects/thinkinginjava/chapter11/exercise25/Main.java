package ru.javaprojects.thinkinginjava.chapter11.exercise25;

import ru.javaprojects.thinkinginjava.chapter11.exercise20.WordReader;

import java.io.IOException;
import java.util.*;

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
        System.out.println(wordIndexing);
    }
}
