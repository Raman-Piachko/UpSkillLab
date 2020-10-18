package com.epam.task.branching;

public class Task2 {
    //Найти max{min(a, b), min(c, d)}
    public static void main(String[] args) {
        System.out.println(calculateValue(1, 2, 3, 4));
        System.out.println(calculateValueOtherMethod(1,2,3,4));
    }

    public static int calculateValue(int a, int b, int c, int d) {
        return Math.max((Math.min(a, b)), (Math.min(c, d)));

    }
    public static int calculateValueOtherMethod(int p, int q, int r, int s) {
        return ((p <= q) ? p : q) >= ((r <= s) ? r : s) ? ((p <= q) ? p : q ): (r <= s) ? r : s;

    }
}
