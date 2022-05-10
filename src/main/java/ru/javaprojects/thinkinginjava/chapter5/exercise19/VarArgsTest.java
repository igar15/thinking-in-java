package ru.javaprojects.thinkinginjava.chapter5.exercise19;

public class VarArgsTest {
    public static void printValues(String... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        printValues("s1", "s2");
        printValues(new String[] {"x1", "x2"});
    }
}
