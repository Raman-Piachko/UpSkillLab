package com.epam.task.cycle;

import static java.lang.Math.pow;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(calculateSum());
    }

    public static int calculateSum() {
        int calculateSum = 0;
        for (int i = 0; i <= 100; i++) {
            calculateSum += pow(i, 2);
        }
        return calculateSum;
    }
}
