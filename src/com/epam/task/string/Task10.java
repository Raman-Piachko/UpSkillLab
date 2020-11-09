package com.epam.task.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.util.InputUtils.inputString;

public class Task10 {
    private static final String REGEX = "[.?!]";

    public static void main(String[] args) {
        String string = inputString("Enter text : ");
        int countOfSentencesInText = countSentence(string);
        System.out.println(countOfSentencesInText);
    }

    public static int countSentence(String string) {
        int countSentence = 0;
        Matcher matcher = Pattern.compile(REGEX).matcher(string);
        while (matcher.find()) {
            countSentence++;
        }

        return countSentence;
    }
}