package com.epam.task.branching;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(calculateValueByX(4));
    }

    public static double calculateValueByX(double x) {
        if (x <= 3) {
            x = (x * x) - (3 * x) + 9;
        } else {
            x = 1 / ((x * x * x) + 6);
        }
        return x;
    }
}
