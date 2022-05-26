package ru.javaprojects.thinkinginjava.chapter13.exercise4;

import java.util.Formatter;

public class Receipt {
    private static final int FORMAT_WIDTH = 5;
    private static final int ITEM_COLUMN_WIDTH_COEFFICIENT = 3;
    private static final int QUANTITY_COLUMN_WIDTH_COEFFICIENT = 1;
    private static final int PRICE_COLUMN_WIDTH_COEFFICIENT = 2;


    private double total;
    private Formatter formatter = new Formatter(System.out);

    public void printTitle() {
        formatter.format(makeFormat("s", "s", "s"), "Item", "Qty", "Price");
        formatter.format(makeFormat("s", "s", "s"), "----", "---", "-----");
    }

    public void print(String name, int quantity, double price) {
        formatter.format(makeFormat("s", "d", ".2f"), name, quantity, price);
        total += price;
    }

    public void printTotal() {
        formatter.format(makeFormat("s", "s", ".2f"), "Tax", "", total * 0.06);
        formatter.format(makeFormat("s", "s", "s"), "", "", "-----");
        formatter.format(makeFormat("s", "s", ".2f"), "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }

    private String makeFormat(String specifier1, String specifier2, String specifier3) {
        StringBuilder sb = new StringBuilder();
        sb
                .append("%-")
                .append(FORMAT_WIDTH * ITEM_COLUMN_WIDTH_COEFFICIENT)
                .append(".")
                .append(FORMAT_WIDTH * ITEM_COLUMN_WIDTH_COEFFICIENT)
                .append(specifier1)
                .append(" %")
                .append(FORMAT_WIDTH * QUANTITY_COLUMN_WIDTH_COEFFICIENT)
                .append(specifier2)
                .append(" %")
                .append(FORMAT_WIDTH * PRICE_COLUMN_WIDTH_COEFFICIENT)
                .append(specifier3)
                .append("\n");
        return sb.toString();
    }
}
