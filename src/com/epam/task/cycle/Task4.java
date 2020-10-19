package com.epam.task.cycle;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(calculateValue());
    }

    public static double calculateValue() {
        long summ = 1L;
        for (int i = 1; i <= 200; i++) {
            summ *= Math.pow(i, 2);
        }
        return summ;

    }
}
