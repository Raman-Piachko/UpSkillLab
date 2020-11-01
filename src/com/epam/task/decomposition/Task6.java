package com.epam.task.decomposition;

import static com.epam.task.decomposition.Task1.findNOD;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(isCoPrimeNumbers(8, 15, 49));
    }

    public static boolean isCoPrimeNumbers(int a, int b, int c) {
        int firstNOD = findNOD(a, b);
        return (findNOD(firstNOD, c) == 1);
    }
}
