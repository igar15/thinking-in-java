package ru.javaprojects.thinkinginjava.chapter5.exercise21;

public class CurrencyTraverser {
    public static void main(String[] args) {
        for (Currency currency : Currency.values()) {
            System.out.println(currency + " ordinal: " + currency.ordinal());
        }
    }
}
