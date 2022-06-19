package ru.javaprojects.thinkinginjava.chapter18.exercise14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputProfiler fileOutputProfiler = new FileOutputProfiler();
        System.out.println(fileOutputProfiler.timeWithoutBuffer());
        System.out.println(fileOutputProfiler.timeWithBuffer());
    }
}
