package com.epam.task.branching;

public class Task2 {
    //Найти max{min(a, b), min(c, d)}
    public static void main(String[] args) {
        System.out.println(calculateValue(1, 2, 3, 4));
        System.out.println(calculateValueMinMax(1, 2, 3, 4));
    }

    public static int calculateValue(int a, int b, int c, int d) {
        return Math.max((Math.min(a, b)), (Math.min(c, d)));
    }


    public static int calculateValueMinMax(int a, int b, int c, int d) {
        return max(min(a, b), min(c, d));
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static int min(int a, int b) {
        if (a <= b) {
            return a;
        }
        return b;
    }
}
