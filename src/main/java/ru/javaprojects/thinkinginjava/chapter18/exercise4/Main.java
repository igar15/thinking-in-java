package ru.javaprojects.thinkinginjava.chapter18.exercise4;

import java.io.File;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "a.*";
        String dirName = "C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise2\\files";
        File dir = new File(dirName);
        File[] files = dir.listFiles((directory, name) -> {
            Pattern pattern = Pattern.compile(regex);
            return pattern.matcher(name).matches();
        });
        long fileSLength = 0;
        for (File file : files) {
            fileSLength += file.length();
        }
        System.out.println(fileSLength);
    }
}
