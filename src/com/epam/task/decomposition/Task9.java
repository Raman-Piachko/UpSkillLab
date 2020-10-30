package com.epam.task.decomposition;

import static java.lang.Math.acos;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(calculateSquareQuadrangle(3, 5, 6.04, 6.27));
    }

    public static double calculateSquareQuadrangle(double x, double y, double z, double t) {
        double square = 0;
        double forthAngle = calculateAngle(x, y, z, t);
        if (forthAngle < 180) {
            square = calculateRightTriangleSquare(x, y) + calculateTriangleSquare(x, y, z, t);
        }
        if (forthAngle > 180) {
            square = calculateRightTriangleSquare(x, y) - calculateTriangleSquare(x, y, z, t);
        }
        return square;
    }

    public static double calculateBisector(double x, double y) {
        return sqrt((pow(x, 2)) + (pow(y, 2)));
    }


    public static double calculateAngle(double x, double y, double z, double t) {
        double bisector = calculateBisector(x, y);
        double cosAngle = ((pow(z, 2) + pow(t, 2)) - pow(bisector, 2)) / (2 * z * t);
        return acos(cosAngle);

    }

    public static double calculateRightTriangleSquare(double x, double y) {
        return (x * y) / 2;
    }

    public static double calculateTriangleSquare(double x, double y, double z, double t) {
        double bisector = calculateBisector(x, y);
        double halfPerimeterTriangle = calculateHalfPerimeterTriangle(x, y, z, t);
        return sqrt(halfPerimeterTriangle * (halfPerimeterTriangle - z) * (halfPerimeterTriangle - t) * (halfPerimeterTriangle - bisector));
    }

    public static double calculateHalfPerimeterTriangle(double x, double y, double z, double t) {
        double bisector = calculateBisector(x, y);
        return ((z + t + bisector) / 2);
    }

}