package ru.javaprojects.thinkinginjava.chapter12.exercise19;

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
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
