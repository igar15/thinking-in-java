package ru.javaprojects.thinkinginjava.chapter11.exercise22;

import ru.javaprojects.thinkinginjava.chapter11.exercise20.WordReader;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        WordReader wordReader = new WordReader("src/main/java/ru/javaprojects/thinkinginjava/chapter11/exercise20/words.txt");
        List<String> words = wordReader.getWords();
        Set<WordCounter> wordCounters = new HashSet<>();
        for (String word : words) {
            WordCounter wordCounter = new WordCounter(word);
            Optional<WordCounter> optional = wordCounters.stream()
                    .filter(wc -> wc.equals(wordCounter))
                    .findFirst();
            if (optional.isPresent()) {
                optional.get().increment();
            } else {
                wordCounters.add(wordCounter);
            }
        }
        List<WordCounter> wordCounterList = new ArrayList<>(wordCounters);
        wordCounterList.sort(Comparator.comparing(wordCounter -> wordCounter.getWord().toUpperCase()));
        System.out.println(wordCounterList);
    }
}
