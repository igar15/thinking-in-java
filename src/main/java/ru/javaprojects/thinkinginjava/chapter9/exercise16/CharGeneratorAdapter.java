package ru.javaprojects.thinkinginjava.chapter9.exercise16;

import java.io.IOException;
import java.nio.CharBuffer;

public class CharGeneratorAdapter extends CharGenerator implements Readable {
    private int counter;

    public CharGeneratorAdapter(int counter) {
        this.counter = counter;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (counter == 0) {
            return -1;
        }
        cb.append("").append(String.valueOf(generate()));
        counter--;
        return 1;
    }
}
