package ru.javaprojects.thinkinginjava.chapter12.exercise4_8;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExThrower {
    public static void doSm() throws MyException {
        throw new MyException("ex");
    }

    public static void main(String[] args) {
        try {
            doSm();
        } catch (MyException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
        }
    }
}
