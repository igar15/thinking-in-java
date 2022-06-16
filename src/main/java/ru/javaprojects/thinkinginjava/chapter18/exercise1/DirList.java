package ru.javaprojects.thinkinginjava.chapter18.exercise1;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DirList {
    public static void main(String[] args) {
        String keyword = "apple";
        String dirName = "C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise1\\files";
        File file = new File(dirName);
        String[] fileList = file.list(((dir, name) -> {
            TextFile textFile = new TextFile(dirName + "\\" + name);
            List<String> lines = textFile.getLines();
            boolean containResult = false;
            for (String line : lines) {
                if (line.contains(keyword)) {
                    containResult = true;
                    break;
                }
            }
            return containResult;
        }));
        System.out.println(Arrays.asList(fileList));
    }
}
