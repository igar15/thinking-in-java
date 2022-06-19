package ru.javaprojects.thinkinginjava.chapter18.exercise15;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\projects\\thinking-in-java\\src\\main\\java\\ru\\javaprojects\\thinkinginjava\\chapter18\\exercise15\\out.txt");
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            dos.writeBoolean(false);
            dos.writeByte(50);
            dos.writeBytes("123");
            dos.writeChar('c');
            dos.writeDouble(1.50);
            dos.writeFloat(1.20f);
            dos.writeInt(10);
            dos.writeLong(1l);
            dos.writeShort(100);
            dos.writeUTF("utf");
        }
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(Arrays.toString(dis.readNBytes(3)));
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());
            System.out.println(dis.readUTF());
        }
    }
}
