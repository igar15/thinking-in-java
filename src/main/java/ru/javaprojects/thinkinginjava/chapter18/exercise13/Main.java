package ru.javaprojects.thinkinginjava.chapter18.exercise13;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise7\\text.txt");
        try (LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(file)))) {
            String s;
            while ((s = lineNumberReader.readLine()) != null) {
                System.out.println(lineNumberReader.getLineNumber());
                System.out.println(s);
            }
        }
    }
}
