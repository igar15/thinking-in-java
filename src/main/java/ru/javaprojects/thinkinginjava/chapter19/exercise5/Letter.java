package ru.javaprojects.thinkinginjava.chapter19.exercise5;

import java.util.Arrays;

public enum Letter {
    VOWEL(new char[] {'a', 'i', 'e', 'o'}), SOMETIMES_A_VOWEL(new char[] {'u'}), CONSONANT (new char[] {'b', 'c', 'd'});

    private char[] letters;

    private Letter(char[] letters) {
        this.letters = letters;
    }


    @Override
    public String toString() {
        return super.toString() + ":" + Arrays.toString(letters);
    }
}
