package ru.javaprojects.thinkinginjava.chapter12.exercise4_8_28;

public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
