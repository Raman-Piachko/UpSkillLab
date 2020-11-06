package com.epam.task.characters;

import static com.epam.task.characters.Task1.insertChar;

public class Task2 {
    public static void main(String[] args) {
        String word = "word ggsdgsd word";
        String letter = changeWordToLetter(word);
        System.out.println(letter);
    }


    public static int countIndexWord(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length - 3; i++) {
            if (chars[i] == 'w' && chars[i + 1] == 'o' && chars[i + 2] == 'r' && chars[i + 3] == 'd') {
                count++;
            }
        }

        return count;
    }

    public static int[] findIndexWord(char[] chars) {
        int[] index = new int[countIndexWord(chars)];
        int step = 0;

        for (int i = 0; i < chars.length - 3; i++) {
            if (chars[i] == 'w' && chars[i + 1] == 'o' && chars[i + 2] == 'r' && chars[i + 3] == 'd') {
                index[step] = i;
                step++;

            }
        }

        return index;
    }


    public static String insertCharacter(String string, int indexForInsert, char ch) {
        char[] chars = string.toCharArray();
        int[] index = findIndexWord(chars);

        for (int i = index.length - 1; i >= 0; i--) {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (index[i] == j) {
                    chars = insertChar(chars, j + indexForInsert, ch);
                }
            }
        }

        return String.valueOf(chars);
    }

    public static String changeWordToWorder(String string) {
        string = insertCharacter(string, 4, 'e');
        return insertCharacter(string, 5, 'r');
    }

    public static String changeWordToLetter(String string) {
        String stringForFormate = changeWordToWorder(string);
        char[] chars = stringForFormate.toCharArray();

        for (int i = 0; i < chars.length - 4; i++) {
            if (chars[i] == 'w' && chars[i + 1] == 'o' && chars[i + 2] == 'r' && chars[i + 3] == 'd') {
                chars[i] = 'l';
                chars[i + 1] = 'e';
                chars[i + 2] = 't';
                chars[i + 3] = 't';
            }
        }

        return String.valueOf(chars);
    }
}
