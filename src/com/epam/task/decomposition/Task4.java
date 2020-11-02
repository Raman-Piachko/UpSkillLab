package com.epam.task.decomposition;

import static com.epam.task.util.MatrixUtils.fillMatrix;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task4 {
    public static void main(String[] args) {
        int[][] points = createPointsArray(5);
        calculateDistance(points);
    }

    public static int[][] createPointsArray(int numberOfPoints) {
        int[][] pointsArray = new int[numberOfPoints][2];
        fillMatrix(pointsArray);
        return pointsArray;
    }

    public static void calculateDistance(int[][] points) {
        double maxDistance = 0;
        String firstPoint = null;
        String secondPoint = null;
        for (int i = 0; i < points.length; i++) {
            for (int j = i; j < points.length - 1; j++) {
                double distance = calculateDistance(points[i][0], points[j + 1][0], points[i][1], points[j + 1][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    firstPoint = "(" + points[i][0] + ":" + points[i][1] + ")";
                    secondPoint = "(" + points[j + 1][0] + ":" + points[j + 1][1] + ")";
                }
            }
        }
        System.out.println(firstPoint);
        System.out.println(secondPoint);
    }

    public static double calculateDistance(double pointX, double point1X, double pointY, double point1Y) {
        return sqrt(pow(pointX - point1X, 2) + pow(pointY - point1Y, 2));
    }

}
