package ru.javaprojects.thinkinginjava.chapter3.exercise3;

import ru.javaprojects.thinkinginjava.chapter3.exercise2.AliasingTest.Data;

public class MethodAliasingTest {
    public static void main(String[] args) {
        Data data = new Data(5.5f);
        changeData(data);
        System.out.println(data.getF());
    }

    public static void changeData(Data data) {
        data.setF(10.0f);
    }
}
