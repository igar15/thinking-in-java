package ru.javaprojects.thinkinginjava.chapter18.exercise17_18;

import java.io.*;

public class TextFile {
    public static String readFile(File file) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
            return sb.toString();
        }
    }
}
