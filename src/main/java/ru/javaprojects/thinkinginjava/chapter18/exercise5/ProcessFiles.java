package ru.javaprojects.thinkinginjava.chapter18.exercise5;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

public class ProcessFiles {
    private File directory;

    public ProcessFiles(String dirName) {
        directory = new File(dirName);
        if (!directory.isDirectory()) {
            throw new RuntimeException();
        }
    }

    public String[] getFileNames(String regex) {
        Pattern pattern = Pattern.compile(regex);
        return directory.list((dir, name) -> pattern.matcher(name).matches());
    }
}
