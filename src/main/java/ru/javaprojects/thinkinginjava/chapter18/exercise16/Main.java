package ru.javaprojects.thinkinginjava.chapter18.exercise16;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise16\\out.txt");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.writeBoolean(false);
            raf.writeByte(10);
            raf.writeChar('c');
            raf.writeDouble(1.50);
            raf.writeFloat(1.25f);
            raf.writeInt(100);
            raf.writeShort(50);
            raf.writeLong(1000);
            raf.writeUTF("utf");
        }
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            System.out.println(raf.readBoolean());
            System.out.println(raf.readByte());
            System.out.println(raf.readChar());
            System.out.println(raf.readDouble());
            System.out.println(raf.readFloat());
            System.out.println(raf.readInt());
            System.out.println(raf.readShort());
            System.out.println(raf.readLong());
            System.out.println(raf.readUTF());
        }
    }
}
