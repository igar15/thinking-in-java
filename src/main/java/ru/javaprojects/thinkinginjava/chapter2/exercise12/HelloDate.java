package ru.javaprojects.thinkinginjava.chapter2.exercise12;

import java.util.Date;

/** This program prints line and date
 * @author Igor Shlyakhtenkov
 * @version 1.0
 */

public class HelloDate {
    /** The entry point to application
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, today is:");
        System.out.println(new Date());
    }
}