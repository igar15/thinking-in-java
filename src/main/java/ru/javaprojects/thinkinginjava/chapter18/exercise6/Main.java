package ru.javaprojects.thinkinginjava.chapter18.exercise6;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws ParseException {
        String dirName = "C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter6";
        FileWalker fileWalker = new FileWalker(dirName);
        System.out.println(fileWalker.getFileNames(".*.java", new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-01")));
    }

}
