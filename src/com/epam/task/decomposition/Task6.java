package com.epam.task.decomposition;

import static com.epam.task.decomposition.Task1.findNod;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(areCoprimeNumbers(8, 15, 49));
    }

    private static boolean areCoprimeNumbers(int a, int b, int c) {
        int firstNOD = findNod(a, b);
        return (findNod(firstNOD, c) == 1);
    }
}
