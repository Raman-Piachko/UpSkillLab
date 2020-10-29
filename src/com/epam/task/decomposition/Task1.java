package com.epam.task.decomposition;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(findNOD(18, 30));
        System.out.println(findNOK(18, 30));
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

    public static int findNOK(int a, int b) {
        return ((a * b) / findNOD(a, b));
    }
}
