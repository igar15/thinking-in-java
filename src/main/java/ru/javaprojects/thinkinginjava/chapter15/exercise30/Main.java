package ru.javaprojects.thinkinginjava.chapter15.exercise30;

import ru.javaprojects.thinkinginjava.chapter15.exercise11.Holder;

public class Main {
    public static void main(String[] args) {
        Holder<Integer> integerHolder = new Holder<>();
        integerHolder.setElement(5);
        int x = integerHolder.getElement();
        Holder<Character> characterHolder = new Holder<>();
        characterHolder.setElement('x');
        char c = characterHolder.getElement();
    }
}
