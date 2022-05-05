package ru.javaprojects.thinkinginjava.chapter4.exercise22;

public class SwitchTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 :
                    System.out.println("The number is 0");
                    break;
                case 1 :
                    System.out.println("The number is 1");
                    break;
                case 2 :
                    System.out.println("The number is 2");
                    break;
            }
        }

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 :
                    System.out.println("The number is 0");
                case 1 :
                    System.out.println("The number is 1");
                case 2 :
                    System.out.println("The number is 2");
            }
        }
    }
}
