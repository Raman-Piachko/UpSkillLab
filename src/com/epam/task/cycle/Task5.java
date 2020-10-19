package com.epam.task.cycle;

public class Task5 {
    public static void main(String[] args) {
        convertNumToChar();
    }

    public static void convertNumToChar() {
        for (int i = 0; i < 255; i++) {
            System.out.printf("Char - %s == int - %d\n", (char) i, i);
        }
    }
}
