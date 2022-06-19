package ru.javaprojects.thinkinginjava.chapter18.exercise6;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileWalker {
    private File directory;

    public FileWalker(String dirName) {
        directory = new File(dirName);
    }

    public List<File> getFiles(String regex, Predicate<File> predicate) {
        Pattern pattern = Pattern.compile(regex);
        return findFilesInDir(pattern, predicate, directory);
    }

    public List<String> getFileNames(String regex, Predicate<File> predicate) {
        List<File> files = getFiles(regex, predicate);
        return files.stream()
                .map(File::getName)
                .collect(Collectors.toList());
    }

    private List<File> findFilesInDir(Pattern pattern, Predicate<File> predicate, File directory) {
        if (!directory.isDirectory()) {
            throw new RuntimeException();
        }
        List<File> files = new ArrayList<>();
        File[] dirFiles = directory.listFiles();
        for (File file : dirFiles) {
            if (file.isDirectory()) {
                files.addAll(findFilesInDir(pattern, predicate, file));
            } else {
                if (pattern.matcher(file.getName()).matches() && predicate.test(file)) {
                    files.add(file);
                }
            }
        }
        return files;
    }
}
