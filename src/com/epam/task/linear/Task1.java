package com.epam.task.linear;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(calculateValue(5, 5, 3));
    }

    public static double calculateValue(double a, double b, double c) {
        return (((a - 3) * (b / 2)) + c);
    }
}
