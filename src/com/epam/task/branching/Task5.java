package com.epam.task.branching;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(calculateValueByX(4));
    }

    public static double calculateValueByX(double x) {
        double y;
        if (x <= 3) {
            y = (Math.pow(x,2)) - (3 * x) + 9;
        } else {
            y = 1 / (Math.pow(x,3) + 6);
        }
        return y;
    }
}
