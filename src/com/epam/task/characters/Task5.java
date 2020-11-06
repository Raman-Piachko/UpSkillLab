package com.epam.task.characters;

public class Task5 {
    public static void main(String[] args) {
        String string = "  a as   af  sfs   ";
        String stringAfterFormat = deleteTwinsSpaces(string);
        System.out.println(stringAfterFormat);
    }


    public static int findFirstNoSpaceIndex(String string) {
        char[] chars = string.toCharArray();
        int firstNoSpaceIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (!Character.isSpaceChar(chars[i])) {
                firstNoSpaceIndex = i;
                break;
            }
        }

        return firstNoSpaceIndex;
    }

    public static int findLastNoSpaceIndex(String string) {
        char[] chars = string.toCharArray();
        int lastNoSpaceIndex = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (!Character.isSpaceChar(chars[i])) {
                lastNoSpaceIndex = i;
                break;
            }
        }

        return lastNoSpaceIndex;
    }

    public static int calculateLengthOfNewArray(String string) {
        return findLastNoSpaceIndex(string) - findFirstNoSpaceIndex(string) + 1;
    }

    public static String deleteSpaceInStartAndEndOfString(String string) {
        char[] charsBefore = string.toCharArray();
        char[] charsAfter = new char[calculateLengthOfNewArray(string)];
        int step = 0;

        for (int i = 0; i < charsBefore.length; i++) {
            if (i >= findFirstNoSpaceIndex(string) && i <= findLastNoSpaceIndex(string)) {
                charsAfter[step] = charsBefore[i];
                step++;
            }
        }

        return String.valueOf(charsAfter);
    }

    public static String deleteTwinsSpaces(String string) {
        String stringForFormat = deleteSpaceInStartAndEndOfString(string);
        char[] charsBefore = stringForFormat.toCharArray();
        char[] charsAfter = new char[charsBefore.length];
        int step = 0;

        for (int i = 0; i < charsBefore.length; i++) {
            if (i + 1 < charsBefore.length) {
                if (charsBefore[i] == charsBefore[i + 1] && Character.isSpaceChar(charsBefore[i])) {
                    charsAfter[step] = charsBefore[i];

                } else {
                    charsAfter[step] = charsBefore[i];
                    step++;
                }
            }
            if (i == charsBefore.length - 1) {
                charsAfter[step] = charsBefore[i];
            }
        }

        return String.valueOf(charsAfter);
    }
}
