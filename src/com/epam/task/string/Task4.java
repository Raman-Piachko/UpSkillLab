package com.epam.task.string;

public class Task4 {
    private static final String INFORMATICA = "информатика";

    public static void main(String[] args) {
        String afterFormat = convertWord(INFORMATICA);
        System.out.println(afterFormat);
    }

    private static int findCharacterIndex(String string, char value) {
        return string.indexOf(value);
    }

    private static String convertWord(String string) {
        int indexT = findCharacterIndex(string, 'т');
        int indexO = findCharacterIndex(string, 'о');
        int indexR = findCharacterIndex(string, 'р');

        return string.substring(indexT, indexT + 1)
                .concat(string.substring(indexO, indexO + 1))
                .concat(string.substring(indexR, indexR + 1))
                .concat(string.substring(indexT, indexT + 1));
    }
}