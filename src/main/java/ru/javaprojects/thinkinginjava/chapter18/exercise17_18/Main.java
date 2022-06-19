package ru.javaprojects.thinkinginjava.chapter18.exercise17_18;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = TextFile.readFile(new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise17_18\\text.txt"));
        Map<Character, Long> collect = s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
        System.out.println(collect);
    }
}
