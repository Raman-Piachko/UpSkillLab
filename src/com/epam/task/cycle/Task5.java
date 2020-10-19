package com.epam.task.cycle;

public class Task5 {
    private static final String STRING = "qwe24@1";

    public static void main(String[] args) {
       // convertNumToChar();
        convertStringToInt();
    }

    public static void convertNumToChar() {
        for (int i = 0; i < 255; i++) {
            System.out.printf("Char - %s == int - %d\n", (char) i, i);
        }
    }

    public static void convertStringToInt() {
        char[] array = STRING.toCharArray();
        for (char c : array) {
            System.out.printf("%s : %d\n", c, (int) c);
        }
    }
}
