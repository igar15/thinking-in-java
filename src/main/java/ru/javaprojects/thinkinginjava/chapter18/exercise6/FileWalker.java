package ru.javaprojects.thinkinginjava.chapter18.exercise6;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class FileWalker {
    private File directory;

    public FileWalker(String dirName) {
        directory = new File(dirName);
    }

    public List<String> getFileNames(String regex, Date lastModified) {
        Pattern pattern = Pattern.compile(regex);
        return findFilesInDir(pattern, lastModified, directory);

    }

    private List<String> findFilesInDir(Pattern pattern, Date lastModified, File directory) {
        if (!directory.isDirectory()) {
            throw new RuntimeException();
        }
        List<String> fileNames = new ArrayList<>();
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                fileNames.addAll(findFilesInDir(pattern, lastModified, file));
            } else {
                if (pattern.matcher(file.getName()).matches() && file.lastModified() > lastModified.getTime()) {
                    fileNames.add(file.getName());
                }
            }
        }
        return fileNames;
    }
}
