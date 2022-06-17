package ru.javaprojects.thinkinginjava.chapter18.exercise5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ProcessFiles processFiles = new ProcessFiles("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise2\\files");
        System.out.println(Arrays.toString(processFiles.getFileNames(".*.txt")));
    }
}
