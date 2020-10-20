package com.epam.task.cycle;

public class Task2 {
    public static void calculateValue(int a, int b, int h, int x) {
        if (x > 2) {
            for (x = a; x <= b; x += h) {
                System.out.printf("x= %d, y= %d\n", x, x);
            }
        } else {
            for (x = a; x <= b; x += h) {
                System.out.printf("x= %d, y= %d\n", x, -x);
            }
        }
    }

    public static void main(String[] args) {
        calculateValue(1, 5, 2, 1);
    }
}
