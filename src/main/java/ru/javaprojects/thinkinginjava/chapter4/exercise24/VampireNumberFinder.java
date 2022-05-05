package ru.javaprojects.thinkinginjava.chapter4.exercise24;

import java.util.List;

import static ru.javaprojects.thinkinginjava.chapter4.exercise24.VampireNumberFinder.DigitPairGroup.DigitPair;

public class VampireNumberFinder {
    public static final int MIN_FOUR_DIGIT_NUMBER = 1000;
    public static final int MAX_FOUR_DIGIT_NUMBER = 9999;

    public static void main(String[] args) {
        findFourDigitVampireNumbers();
    }

    public static void findFourDigitVampireNumbers() {
        for (int fourDigitNumber = MIN_FOUR_DIGIT_NUMBER; fourDigitNumber <= MAX_FOUR_DIGIT_NUMBER; fourDigitNumber++) {
            char[] digits = ("" + fourDigitNumber).toCharArray();
            DigitPairGroup firstGroup =
                    new DigitPairGroup(new DigitPair(digits[0], digits[1]), new DigitPair(digits[2], digits[3]));
            DigitPairGroup secondGroup =
                    new DigitPairGroup(new DigitPair(digits[0], digits[2]), new DigitPair(digits[1], digits[3]));
            DigitPairGroup thirdGroup =
                    new DigitPairGroup(new DigitPair(digits[0], digits[3]), new DigitPair(digits[1], digits[2]));
            List<DigitPairGroup> digitPairGroups = List.of(firstGroup, secondGroup, thirdGroup);
            checkNumberIsVampire(fourDigitNumber, digitPairGroups);
        }
    }

    static class DigitPairGroup {
        private final DigitPair firstDigitPair;
        private final DigitPair secondDigitPair;

        public DigitPairGroup(DigitPair firstDigitPair, DigitPair secondDigitPair) {
            this.firstDigitPair = firstDigitPair;
            this.secondDigitPair = secondDigitPair;
        }

        static class DigitPair {
            private final int firstCombinedNumber;
            private final int secondCombinedNumber;

            public DigitPair(char firstDigit, char secondDigit) {
                firstCombinedNumber = Integer.parseInt(firstDigit + "" + secondDigit);
                secondCombinedNumber = Integer.parseInt(secondDigit + "" + firstDigit);
            }
        }
    }

    private static void checkNumberIsVampire(int number, List<DigitPairGroup> digitPairGroups) {
        for (DigitPairGroup digitPairGroup : digitPairGroups) {
            DigitPair firstPair =  digitPairGroup.firstDigitPair;
            DigitPair secondPair =  digitPairGroup.secondDigitPair;
            if (firstPair.firstCombinedNumber * secondPair.firstCombinedNumber == number) {
                printVampireNumber(number, firstPair.firstCombinedNumber, secondPair.firstCombinedNumber);
                break;
            } else if (firstPair.secondCombinedNumber * secondPair.firstCombinedNumber == number) {
                printVampireNumber(number, firstPair.secondCombinedNumber, secondPair.firstCombinedNumber);
                break;
            } else if (firstPair.firstCombinedNumber * secondPair.secondCombinedNumber == number) {
                printVampireNumber(number, firstPair.firstCombinedNumber, secondPair.secondCombinedNumber);
                break;
            } else if (firstPair.secondCombinedNumber * secondPair.secondCombinedNumber == number) {
                printVampireNumber(number, firstPair.secondCombinedNumber, secondPair.secondCombinedNumber);
                break;
            }
        }
    }

    private static void printVampireNumber(int number, int firstMultiplier, int secondMultiplier) {
        System.out.println(number + " = " + firstMultiplier + " * " + secondMultiplier);
    }
}