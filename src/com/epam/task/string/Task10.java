package com.epam.task.string;

import static com.epam.task.util.InputUtils.inputString;

public class Task10 {
    private static final char QUESTION_CHAR = '?';
    private static final char FULL_STOP_CHAR = '.';
    private static final char EXCLAMATION_CHAR = '!';


    public static void main(String[] args) {
        String string = inputString("Enter text : ");
        int countOfSentencesInText = countSentence(string);
        System.out.println(countOfSentencesInText);
    }

    public static int countSentence(String string) {
        int countSentence = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == QUESTION_CHAR || string.charAt(i) == FULL_STOP_CHAR || string.charAt(i) == EXCLAMATION_CHAR) {
                countSentence++;
            }
        }

        return countSentence;
    }
}