package com.epam.task.decomposition;

import static com.epam.task.util.MatrixUtils.fillMatrix;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task4 {
    public static void main(String[] args) {
        int[][] points = createPointsArray(5);
        calculateDistance(points);
    }

    public static int[][] createPointsArray(int n) {
        int[][] point = new int[n][2];
        fillMatrix(point);
        return point;
    }

    public static void calculateDistance(int[][] points) {
        double maxDistance = 0;
        String firstPoint = null;
        String secondPoint = null;
        for (int i = 0; i < points.length; i++) {
            for (int m = i; m < points.length - 1; m++) {
                double distance = calculateDistance(points[i][0], points[m + 1][0], points[i][1], points[m + 1][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    firstPoint = "(" + points[i][0] + ":" + points[i][1] + ")";
                    secondPoint = "(" + points[m + 1][0] + ":" + points[m + 1][1] + ")";
                }
            }
        }
        System.out.println(firstPoint);
        System.out.println(secondPoint);
    }

    public static double calculateDistance(double x, double x1, double y, double y1) {
        return sqrt(pow(x - x1, 2) + pow(y - y1, 2));
    }

}
