package ru.javaprojects.thinkinginjava.chapter18.image_copy.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\image_copy\\source\\image.jpg");
        byte[] bytes = Files.readAllBytes(path);
        Path targetPath = Path.of("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\image_copy\\nio\\imagedir", "copy.jpg");
        Files.write(targetPath, bytes, StandardOpenOption.CREATE);
    }
}
