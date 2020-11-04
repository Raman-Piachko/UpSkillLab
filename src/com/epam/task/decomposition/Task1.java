package com.epam.task.decomposition;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(findNod(18, 30));
        System.out.println(findNok(18, 30));
    }

    public static int findNod(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    private static int findNok(int a, int b) {
        return ((a * b) / findNod(a, b));
    }
}
