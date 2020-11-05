package com.epam.task.characters;

import static com.epam.task.characters.Task1.insertCharacter;

public class Task2 {
    public static void main(String[] args) {
        String string = "word word";
        System.out.println(changeWordToLetter(string));
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



    public static String formatedStringToE(String sting) {
        char[] chars = sting.toCharArray();
        int[] index = findIndexWord(chars);

        for (int i = index.length - 1; i >= 0; i--) {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (index[i] == j) {
                    chars = insertCharacter(chars, j+4,'e');
                }
            }
        }

        return String.valueOf(chars);
    }

    public static String formatedStringToER(String string) {
        char[] chars = string.toCharArray();
        int[] index = findIndexWord(chars);

        for (int i = index.length - 1; i >= 0; i--) {
            for (int j = chars.length - 1; j >= 0; j--) {
                if (index[i] == j) {
                    chars = insertCharacter(chars, j+5,'r');
                }
            }
        }

        return String.valueOf(chars);
    }

    public static String changeWordToLett(String string) {
        char[] chars = string.toCharArray();


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

    public static  String changeWordToLetter(String string){
        string=formatedStringToE(string);
        string=formatedStringToER(string);

        return changeWordToLett(string);
    }


}
