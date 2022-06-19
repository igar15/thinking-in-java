package ru.javaprojects.thinkinginjava.chapter18.exercise8_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        args = new String[]{"C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise7\\text.txt", "1", "2"};
        File file = new File(args[0]);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (args.length > 1) {
                    for (int i = 1; i < args.length; i++) {
                        if (line.contains(args[i])) {
                            System.out.println(line);
                            break;
                        }
                    }
                }
            }
        }
   }
}
