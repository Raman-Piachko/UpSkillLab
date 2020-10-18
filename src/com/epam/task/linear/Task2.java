package com.epam.task.linear;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(calculateValue(2, 3, 4));
    }

    public static double calculateValue(double a, double b, double c) {
        double d = b * b + 4 * a * c;
       return (b + Math.sqrt(d)) / 2*a - Math.pow(a, 3) * c + Math.pow(c, -2);
    }
}
