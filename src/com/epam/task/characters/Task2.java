package com.epam.task.characters;

public class Task2 {
    private static final String LETTER = "letter";
    private static final String WORD = "word";
    private static final String STRING = "word ggsdgsd word";

    public static void main(String[] args) {
        System.out.println(STRING);
        String stringAfterChange = convertWordToLetter(STRING);
        System.out.println(stringAfterChange);
    }

    private static int countIndexWord(char[] chars) {
        int count = 0;
        char[] word = WORD.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == word[0] && chars[i + 1] == word[1] && chars[i + 2] == word[2] && chars[i + 3] == word[3]) {
                count++;
            }
        }

        return count;
    }

    private static String convertWordToLetter(String string) {
        char[] arrayBefore = string.toCharArray();
        char[] arrayAfter = new char[calculateNewArrayLength(string)];
        char[] letter = LETTER.toCharArray();
        char[] word = WORD.toCharArray();
        int indexInNewArray = 0;

        for (int i = 0; i < arrayBefore.length; i++) {
            if (arrayBefore[i] == word[0] && arrayBefore[i + 1] == word[1] && arrayBefore[i + 2] == word[2] && arrayBefore[i + 3] == word[3]) {
                for (char value : letter) {
                    arrayAfter[indexInNewArray] = value;
                    indexInNewArray++;

                }
                i = i + 3;
            } else {
                arrayAfter[indexInNewArray] = arrayBefore[i];
                indexInNewArray++;
            }
        }

        return String.valueOf(arrayAfter);
    }

    private static int calculateNewArrayLength(String string) {
        char[] oldArray = string.toCharArray();
        return oldArray.length + countIndexWord(oldArray) * 2;
    }
}
