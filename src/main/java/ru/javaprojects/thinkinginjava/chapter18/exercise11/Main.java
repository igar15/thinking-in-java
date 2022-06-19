package ru.javaprojects.thinkinginjava.chapter18.exercise11;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise11\\events.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(parseEvent(s));
            }
        }
    }

    private static Event parseEvent(String line) {
        String[] split = line.split("=");
        return new Event(split[0], Integer.parseInt(split[1]));
    }
}
