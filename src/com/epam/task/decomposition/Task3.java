package com.epam.task.decomposition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(calculateHexagonSquare(5));
    }

    public static double calculateTriangleSquare(int side) {
        return (pow(side, 2) * sqrt(3)) / 4;
    }

    public static double calculateHexagonSquare(int side) {
        return 6 * calculateTriangleSquare(side);
    }
}
