package com.epam.task.string;

import static com.epam.task.util.InputUtils.inputString;

public class Task10 {
    private static final String REGEX = "[.?!]";

    public static void main(String[] args) {
        String string = inputString("Enter text : ");
        int countOfSentencesInText = countSentence(string);
        System.out.println(countOfSentencesInText);
    }

    public static int countSentence(String string) {
        return string.split(REGEX).length;
    }
}