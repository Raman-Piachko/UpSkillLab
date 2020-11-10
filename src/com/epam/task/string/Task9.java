package com.epam.task.string;

import static com.epam.task.util.InputUtils.inputString;

public class Task9 {
    private static final char FIRST_LATIN_CHAR_IN_UPPER_CASE = 'A';
    private static final char LAST_LATIN_CHAR_IN_UPPER_CASE = 'Z';
    private static final char FIRST_LATIN_CHAR_IN_LOWER_CASE = 'a';
    private static final char LAST_LATIN_CHAR_IN_LOWER_CASE = 'z';

    public static void main(String[] args) {
        String string = inputString("Enter string : ");
        printNumberOfCharInUpperLowerCase(string);
    }

    public static int countCharInUpperCase(String string) {
        int countInUpperCase = 0;

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter >= FIRST_LATIN_CHAR_IN_UPPER_CASE && letter <= LAST_LATIN_CHAR_IN_UPPER_CASE) {
                countInUpperCase++;
            }
        }

        return countInUpperCase;
    }

    public static int countCharInLowerCase(String string) {
        int countInLowerCase = 0;

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter >= FIRST_LATIN_CHAR_IN_LOWER_CASE && letter <= LAST_LATIN_CHAR_IN_LOWER_CASE) {
                countInLowerCase++;
            }
        }

        return countInLowerCase;
    }

    public static void printNumberOfCharInUpperLowerCase(String string) {
        System.out.printf("The number of characters in lower case : %d\n", countCharInLowerCase(string));
        System.out.printf("The number of characters in upper case : %d", countCharInUpperCase(string));
    }
}
