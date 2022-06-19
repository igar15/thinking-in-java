package ru.javaprojects.thinkinginjava.chapter18.exercise6;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String dirName = "C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter6";
        FileWalker fileWalker = new FileWalker(dirName);
        Predicate<File> predicate = (file) -> {
            try {
                return file.lastModified() > new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-01").getTime();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        };
        System.out.println(fileWalker.getFileNames(".*.java", predicate));
    }
}
