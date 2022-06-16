package ru.javaprojects.thinkinginjava.chapter18.exercise2;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    private File dir;

    public SortedDirList(String dirPath) {
        dir = new File(dirPath);
    }

    public String[] list() {
        String[] fileList = dir.list();
        Arrays.sort(fileList);
        return fileList;
    }

    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        String[] fileList = dir.list((directory, name) -> pattern.matcher(name).matches());
        Arrays.sort(fileList);
        return fileList;
    }
}
