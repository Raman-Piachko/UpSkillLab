package com.epam.task.decomposition;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findNOD4(15, 30, 90, 120));
    }

    public static int findNOD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int findNOD4(int a, int b, int c, int d) {
        int x = findNOD(a, b);
        int y = findNOD(c, d);
        return findNOD(x, y);
    }
}
