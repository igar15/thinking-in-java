package ru.javaprojects.thinkinginjava.chapter18.exercise12;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise7\\text.txt");
        List<String> strings = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String s;
            while ((s = reader.readLine()) != null) {
                strings.add(s);
            }
            File target = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise12\\out.txt");
            try (PrintWriter printWriter = new PrintWriter(target)) {
                for (int i = 0; i < strings.size(); i++) {
                    printWriter.println(i + 1 + " : " + strings.get(i));
                }
            }
        }
    }
}
