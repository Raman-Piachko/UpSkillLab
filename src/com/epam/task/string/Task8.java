package com.epam.task.string;

import static com.epam.task.util.InputUtils.inputString;

public class Task8 {

    public static void main(String[] args) {
        String string = inputString("Enter string: ");
        printWordWithMaxLength(string);
    }

    public static int findMaxLengthOfWord(String string) {
        String[] strings = string.split("\\s+");
        int maxLengthOfWord = 0;

        for (String s : strings) {
            if (s.length() >= maxLengthOfWord) {
                maxLengthOfWord = s.length();
            }
        }

        return maxLengthOfWord;
    }

    public static void printWordWithMaxLength(String string) {
        String[] strings = string.split("\\s+");
        int maxLengthOfWord = findMaxLengthOfWord(string);
        int countDuplicateMaxLengthWords = 0;
        String wordWithMaxLength = "";

        for (String s : strings) {
            if (s.length() == maxLengthOfWord) {
                wordWithMaxLength = s;
                countDuplicateMaxLengthWords++;
            }
        }

        if (countDuplicateMaxLengthWords == 1) {
            System.out.println("The word with max length is :".concat(wordWithMaxLength));
        }
    }
}