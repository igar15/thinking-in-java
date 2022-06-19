package ru.javaprojects.thinkinginjava.chapter18.exercise20;

import ru.javaprojects.thinkinginjava.chapter18.exercise19.BinaryFile;
import ru.javaprojects.thinkinginjava.chapter18.exercise6.FileWalker;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWalker fileWalker = new FileWalker("C:\\projects\\thinking-in-java\\target\\classes\\ru\\javaprojects\\thinkinginjava\\chapter18");
        List<File> files = fileWalker.getFiles(".*.class", (file) -> true);
        for (File file : files) {
            byte[] bytes = BinaryFile.read(file);
            System.out.println(bytesToHex(bytes));
        }
    }

    private static final byte[] HEX_ARRAY = "0123456789ABCDEF".getBytes(StandardCharsets.US_ASCII);
    public static String bytesToHex(byte[] bytes) {
        byte[] hexChars = new byte[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars, StandardCharsets.UTF_8);
    }
}
