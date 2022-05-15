package ru.javaprojects.thinkinginjava.chapter9.exercise16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new CharGeneratorAdapter(5));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
