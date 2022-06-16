package ru.javaprojects.thinkinginjava.chapter18.exercise3;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        String dirPath = "C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise1\\files";
        File dir = new File(dirPath);
        long size = 0;
        File[] files = dir.listFiles();
        for (File file : files) {
            size += file.length();
        }
        System.out.println(size);
    }
}
