package com.epam.task.string;

import static com.epam.task.util.InputUtils.inputString;

public class Task7 {

    public static void main(String[] args) {
        String string = inputString("Enter string : ");
        String after = deleteRepeatedChars(string);
        System.out.println(after);
    }

    public static String deleteRepeatedChars(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean repeatedChar;

        for (int i = 0; i < string.length(); i++) {
            repeatedChar = false;
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    repeatedChar = true;
                    break;
                }
            }
            if (!repeatedChar) {
                stringBuilder.append(string.charAt(i));
            }
        }

        return String.valueOf(stringBuilder);
    }
}