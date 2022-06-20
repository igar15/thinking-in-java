package ru.javaprojects.thinkinginjava.chapter18.exercise28;

import java.io.*;

class Blips {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BlipCheck blip2 = new BlipCheck();
        try (ObjectOutputStream ous = new ObjectOutputStream(baos)) {
            ous.writeObject(blip2);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()))) {
            BlipCheck blip = (BlipCheck) ois.readObject();
        }
    }
}

public class BlipCheck implements Externalizable {
//    Blip2() {
//
//    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
