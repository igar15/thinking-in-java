package ru.javaprojects.thinkinginjava.chapter15.exercise37;

import java.awt.*;

public class Mixin extends Basic implements TimeStamped, SerialNumbered, Colored {
    private String s;
    private TimeStamped timeStamped = System::currentTimeMillis;
    private SerialNumbered serialNumbered = new SerialNumberedImpl();
    private Colored colored = () -> Color.BLACK;


    private static class SerialNumberedImpl implements SerialNumbered {
        private static long counter = 0;
        private final long count;

        public SerialNumberedImpl() {
            count = counter++;
        }

        @Override
        public long getSerialNumber() {
            return count;
        }
    }

    public Mixin(String s) {
        this.s = s;
    }

    @Override
    public String get() {
        return s;
    }

    @Override
    public void set(String s) {
        this.s = s;
    }

    @Override
    public Color getColor() {
        return colored.getColor();
    }

    @Override
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }

    @Override
    public long getTime() {
        return timeStamped.getTime();
    }

    @Override
    public String toString() {
        return String.format("%s time: %d serial: %d color: %s", s, getTime(), getSerialNumber(), getColor());
    }
}
