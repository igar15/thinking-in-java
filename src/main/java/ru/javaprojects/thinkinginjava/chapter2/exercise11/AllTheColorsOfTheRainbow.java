package ru.javaprojects.thinkinginjava.chapter2.exercise11;

public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow colors = new AllTheColorsOfTheRainbow();
        colors.anIntegerRepresentingColors = 10;
        colors.changeTheHueOfTheColor(15);
        System.out.println(colors.anIntegerRepresentingColors);
    }
}
