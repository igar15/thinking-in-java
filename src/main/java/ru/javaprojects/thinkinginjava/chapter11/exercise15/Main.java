package ru.javaprojects.thinkinginjava.chapter11.exercise15;

public class Main {
    public static final char PLUS = '+';
    public static final char MINUS = '-';

    public static void main(String[] args) {
        String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> stack = new Stack<>();
        char[] chars = expression.toCharArray();
        for (int i = 0; i < chars.length; ) {
            if (chars[i] == PLUS) {
                stack.push(chars[i+1]);
                i += 2;
            } else if (chars[i] == MINUS) {
                System.out.print(stack.pop());
                i++;
            }
        }
    }
}
