package ru.javaprojects.thinkinginjava.chapter11.exercise22;

import java.util.Objects;

public class WordCounter {
    private String word;
    private int counter;

    public WordCounter(String word) {
        this.word = word;
        counter = 1;
    }

    public void increment() {
        counter++;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordCounter that = (WordCounter) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return word + " -> " + counter;
    }
}
