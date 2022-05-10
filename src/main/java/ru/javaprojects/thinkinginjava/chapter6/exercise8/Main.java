package ru.javaprojects.thinkinginjava.chapter6.exercise8;

import ru.javaprojects.thinkinginjava.chapter6.exercise8.inner.Connection;
import ru.javaprojects.thinkinginjava.chapter6.exercise8.inner.ConnectionManager;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(ConnectionManager.getConnection());
        }
//        Connection connection = new Connection(10);
    }
}
