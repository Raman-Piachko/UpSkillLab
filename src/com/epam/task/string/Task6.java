package com.epam.task.string;

public class Task6 {
    private static final String STRING = "AFAHSFKH asf";

    public static void main(String[] args) {
        System.out.println(duplicateAllChars(STRING));
    }

    public static String duplicateAllChars(String string) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            char charToTwins = string.charAt(i);
            stringBuffer.append(charToTwins).append(charToTwins);
        }

        return String.valueOf(stringBuffer);
    }
}