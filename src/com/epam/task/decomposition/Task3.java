package com.epam.task.decomposition;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(calculateHexagonSquare(5));
    }

    public static double calculateTriangleSquare(int a) {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    public static double calculateHexagonSquare(int a) {
        return 6 * calculateTriangleSquare(a);
    }
}
