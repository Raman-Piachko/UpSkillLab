package com.epam.task.characters;

public class Task3 {
    public static void main(String[] args) {
        String string = "afas fasfaf97fas as5f5a 58fas";
        int countOfDigitsInString = countDigitsInString(string);
        System.out.println(countOfDigitsInString);
    }

    public static int countDigitsInString(String string) {
        char[] chars = string.toCharArray();
        int count = 0;

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                count++;
            }
        }

        return count;
    }
}
