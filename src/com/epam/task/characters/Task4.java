package com.epam.task.characters;

public class Task4 {
    public static void main(String[] args) {
        String string = "214 af8 faf6886s 90 gd 2";
        int result = countNumbersInString(string);
        System.out.println();
        System.out.println(result);
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
