package ru.javaprojects.thinkinginjava.chapter17.exercise42;

import ru.javaprojects.thinkinginjava.chapter17.exercise40.StringGenerator;
import ru.javaprojects.thinkinginjava.chapter17.exercise40.TwoString;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TwoString[] twoStrings = new TwoString[10];
        List<TwoString> list = new ArrayList<>();
        StringGenerator stringGenerator = new StringGenerator();
        for (int i = 0; i < 10; i++) {
            twoStrings[i] = new TwoString(stringGenerator.next(), stringGenerator.next());
            list.add(twoStrings[i]);
        }
        Arrays.sort(twoStrings);
        Collections.sort(list);
        System.out.println(Arrays.toString(twoStrings));
        System.out.println(list);

        Comparator<TwoString> comparator = Comparator.comparing(TwoString::getSecond, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(twoStrings, comparator);
        Collections.sort(list, comparator);
        System.out.println(Arrays.toString(twoStrings));
        System.out.println(list);

        TwoString forSearch = twoStrings[3];
        System.out.println(Arrays.binarySearch(twoStrings, forSearch, comparator));
        System.out.println(Collections.binarySearch(list, forSearch, comparator));

    }
}
