package com.epam.task.characters;

public class Task4 {
    private static final String STRING = "214 af8 faf6886s 90 gd 2";

    public static void main(String[] args) {
        int result = countNumbersInString(STRING);
        System.out.println("\n" + result);
    }

    public static int countNumbersInString(String string) {
        char[] chars = string.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                System.out.print(chars[i]);
                i++;
                while (i < chars.length && Character.isDigit(chars[i])) {
                    System.out.print(chars[i]);
                    i++;
                }
                System.out.print(" ");
                count++;
            }
        }

        return count;
    }
}
