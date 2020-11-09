package com.epam.task.string;

import java.util.Arrays;

import static com.epam.task.util.InputUtils.inputString;

public class Task8 {
    private static final String SPACE = "\\s+";

    public static void main(String[] args) {
        String string = inputString("Enter string: ");
        printWordWithMaxLength(string);
    }

    public static void printWordWithMaxLength(String string) {
        String[] strings = string.split(SPACE);
        Arrays.sort(strings);

        if (!strings[0].equals(strings[1])) {
            System.out.println("The word with max length is :".concat(strings[0]));
        }
    }
}