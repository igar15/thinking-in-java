package ru.javaprojects.thinkinginjava.chapter15.exercise5;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        String element = null;
        while ((element = stack.pop()) != null) {
            System.out.println(element);
        }
    }
}
