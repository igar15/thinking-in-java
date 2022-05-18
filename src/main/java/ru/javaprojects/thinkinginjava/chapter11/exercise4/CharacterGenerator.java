package ru.javaprojects.thinkinginjava.chapter11.exercise4;

public class CharacterGenerator {
    private static final String[] characters = {"SpiderMan", "Batman", "Mobius", "Venom", "Goblin"};
    private int cursor = 0;

    public String next() {
        if (cursor == characters.length) {
            cursor = 0;
        }
        return characters[cursor++];
    }
}
