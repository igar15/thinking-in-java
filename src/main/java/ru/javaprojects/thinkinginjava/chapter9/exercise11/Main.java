package ru.javaprojects.thinkinginjava.chapter9.exercise11;

public class Main {
    public static void main(String[] args) {
        ChapSwapperAdapter adapter = new ChapSwapperAdapter(new CharSwapper());
        Apply.process(adapter, "abcd");
    }
}
