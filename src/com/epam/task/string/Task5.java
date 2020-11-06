package com.epam.task.string;

public class Task5 {
    private static final String STRING = "charArrayAfsTfafss";
    private static final char CHAR = 'a';

    public static void main(String[] args) {
        int countCharA = countChar(STRING);
        System.out.println(countCharA);
    }

    private static int countChar(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == Character.toLowerCase(CHAR) || string.charAt(i) == Character.toUpperCase(CHAR)) {
                count++;
            }
        }

        return count;
    }
}