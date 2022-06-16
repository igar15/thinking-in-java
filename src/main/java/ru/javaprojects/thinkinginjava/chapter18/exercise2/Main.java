package ru.javaprojects.thinkinginjava.chapter18.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise2\\files");
        System.out.println(Arrays.toString(sortedDirList.list()));
        System.out.println(Arrays.toString(sortedDirList.list("[a].*")));
    }
}
