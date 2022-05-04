package ru.javaprojects.thinkinginjava.chapter3.exercise1;

import static java.lang.System.out;
import static ru.javaprojects.thinkinginjava.chapter3.exercise1.Print.print;

public class PrintTest {
    public static void main(String[] args) {
        System.out.println("long printing");
        out.println("short printing");
        print("custom printing");
    }
}

class Print {
    public static void print(String s) {
        out.println(s);
    }
}