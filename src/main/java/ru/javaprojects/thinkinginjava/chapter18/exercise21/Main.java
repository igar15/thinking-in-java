package ru.javaprojects.thinkinginjava.chapter18.exercise21;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        printUpperCase(System.in);
        printUpperCase(new FileInputStream(new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise17_18\\text.txt")));
    }

    public static void printUpperCase(InputStream inputStream) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String s;
            while ((s = br.readLine()) != null && !s.isBlank()) {
                System.out.println(s.toUpperCase());
            }
        }
    }
}