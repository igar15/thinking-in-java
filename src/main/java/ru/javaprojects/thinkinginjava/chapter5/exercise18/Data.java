package ru.javaprojects.thinkinginjava.chapter5.exercise18;

public class Data {
    public Data(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Data[] datas = new Data[3];
        datas[0] = new Data("s1");
        datas[1] = new Data("s2");
        datas[2] = new Data("s3");
    }
}
