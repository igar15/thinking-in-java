package ru.javaprojects.thinkinginjava.chapter18.exercise22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OsExecute {
    public static List<String> command(String command) {
        boolean err = false;
        List<String> errorList = new ArrayList<>();
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            try (BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
                BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
                String s;
                while ((s = results.readLine()) != null) {
                    System.out.println(s);
                }
                while ((s = errors.readLine()) != null) {
                    err = true;
                    errorList.add(s);
                }
            }
            return errorList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
