package com.epam.task.characters;

public class Task3 {
    private static final String STRING = "afas fasfaf97fas as5f5a 58fas";

    public static void main(String[] args) {
        int countOfDigitsInString = countDigitsInString(STRING);
        System.out.println(countOfDigitsInString);
    }

    public static int countDigitsInString(String string) {
        char[] chars = string.toCharArray();
        int count = 0;

        for (char value : chars) {
            if (Character.isDigit(value)) {
                count++;
            }
        }

        return count;
    }
}
