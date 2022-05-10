package ru.javaprojects.thinkinginjava.chapter5.exercise22;

import ru.javaprojects.thinkinginjava.chapter5.exercise21.Currency;

public class CurrencySwitcher {
    public static void main(String[] args) {
        for (Currency currency : Currency.values()) {
            switch (currency) {
                case RUBLE:
                    System.out.println("This is Ruble");
                    break;
                case EURO:
                    System.out.println("Euro");
                    break;
                case YEN:
                    System.out.println("Yen");
                    break;
                case TENGO:
                    System.out.println("tengo");
                    break;
                case DOLLAR:
                    System.out.println("Dollar");
                    break;
                case GRIVNA:
                    System.out.println("Grivna");
                    break;
            }
        }
    }
}
