package com.epam.task.characters;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] string = {"charArrayAfsTfsfsY", "safAsffF"};
        String[] formatArrayOfStings = formatArrayOfStings(string);
        System.out.println(Arrays.toString(formatArrayOfStings));
    }

    private static String[] formatArrayOfStings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = formatStringToSnakeCase(strings[i]);
        }

        return strings;
    }

    private static String formatStringToSnakeCase(String sting) {
        char[] chars = sting.toCharArray();
        int[] index = findIndex(chars);

        for (int i = index.length - 1; i >= 0; i--) {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (index[i] == j) {
                    chars = insertChar(chars, j, '_');
                }
            }
        }
        formatToLowerCase(chars);

        return String.valueOf(chars);
    }

    public static char[] insertChar(char[] chars, int index, char val) {

        char[] charsAfter = new char[chars.length + 1];
        int step = 0;

        for (int i = 0; i < charsAfter.length; i++) {
            if (i == index) {
                charsAfter[i] = val;
            } else {
                charsAfter[i] = chars[step];
                step++;
            }
        }

        return charsAfter;
    }

    private static int countIndex(char[] chars) {
        int count = 0;

        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                count++;
            }
        }

        return count;
    }

    private static int[] findIndex(char[] chars) {
        int[] index = new int[countIndex(chars)];
        int step = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                index[step] = i;
                step++;
            }
        }

        return index;
    }


    private static void formatToLowerCase(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
    }
}






