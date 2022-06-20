package ru.javaprojects.thinkinginjava.chapter18.exercise29;

import java.io.*;

public class Blip3 implements Externalizable {
    private String s;
    private int i;

    public Blip3() {
    }

    public Blip3(String s, int i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(s);
//        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }

    @Override
    public String toString() {
        return "Blip3{" +
                "s='" + s + '\'' +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Blip3 blip3 = new Blip3("123", 10);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream ous = new ObjectOutputStream(baos)) {
            ous.writeObject(blip3);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            Blip3 blip = (Blip3) ois.readObject();
            System.out.println(blip);
        }
    }
}
