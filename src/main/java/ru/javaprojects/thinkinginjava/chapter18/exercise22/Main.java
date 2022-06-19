package ru.javaprojects.thinkinginjava.chapter18.exercise22;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> errors = OsExecute.command("javap C:\\projects\\thinking-in-java\\target\\classes\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise22\\Main");
        System.out.println(errors);
    }
}
