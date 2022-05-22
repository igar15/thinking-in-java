package ru.javaprojects.thinkinginjava.chapter11.exercise16;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'A', 'E', 'I', 'O'));
        WordReader wordReader = new WordReader("src/main/java/ru/javaprojects/thinkinginjava/chapter11/exercise16/words.txt");
        List<String> words = wordReader.getWords();

        Map<String, Long> vowelsCount = words.stream()
                .collect(Collectors.groupingBy(word -> word,
                        Collectors.summingLong(word -> word.chars()
                                .filter(c -> vowels.contains((char) c))
                                .count())));
        System.out.println(vowelsCount);
        System.out.println("All vowels amount: " + vowelsCount.values().stream().mapToLong(l -> l).sum());

//        int globalVowelsCounter = 0;
//        for (String word : words) {
//            int vowelsCounter = 0;
//            char[] chars = word.toCharArray();
//            for (char c : chars) {
//                if (vowels.contains(c)) {
//                    vowelsCounter++;
//                    globalVowelsCounter++;
//                }
//            }
//            System.out.println(word + " -> " + vowelsCounter + " vowels");
//        }
//        System.out.println("All vowels amount: " + globalVowelsCounter);
    }
}
