package com.epam.task.cycle;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(calculateSum());
    }

    public static double calculateSum() {
        long calculatedSum = 1L;
        for (int i = 1; i <= 200; i++) {
            calculatedSum *= Math.pow(i, 2);
        }
        return calculatedSum;

    }
}
