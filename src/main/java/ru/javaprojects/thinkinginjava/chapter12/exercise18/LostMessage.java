package ru.javaprojects.thinkinginjava.chapter12.exercise18;

public class LostMessage {
    public void f() throws Ex1 {
        throw new Ex1();
    }

    public void dispose() throws Ex2 {
        throw new Ex2();
    }

    public static void main(String[] args) {
        LostMessage lostMessage = new LostMessage();
        try {
            try {
                lostMessage.f();
            } finally {
                try {
                    lostMessage.dispose();
                } finally {
                    throw new RuntimeException("runtime ex");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
