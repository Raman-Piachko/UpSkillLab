package com.epam.task.cycle;

import static java.lang.Math.pow;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(calculateSummaSqrFirst100Num());
    }

    public static int calculateSummaSqrFirst100Num() {
        int summ = 0;
        for (int i = 0; i <= 100; i++) {
            summ += pow(i,2);
        }
        return summ;
    }
}
