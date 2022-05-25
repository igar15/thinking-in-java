package ru.javaprojects.thinkinginjava.chapter12.exercise26;

import java.io.FileInputStream;

public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("1.txt");
        fis.close();
    }
}
