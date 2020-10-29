package com.epam.task.decomposition;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;
import static com.epam.task.util.MatrixUtils.printMatrix;

public class Task4 {
    public static void main(String[] args) {
        int[][] point = createPoints();
        printMatrix(point);
        calculateDistance(point);

    }

    public static int[][] createPoints() {
        int[] x = {1, 2, 8, 20};//createXPoints();
        int[] y = {1, 2, 8, 20};//createYPoints();
        int[][] point = new int[x.length][2];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    point[i][j] = x[i];
                } else {
                    point[i][j] = y[i];
                }
            }
        }
        return point;
    }

    public static int[] createXPoints() {
        return fillArray(createArray());
    }

    public static int[] createYPoints() {
        return fillArray(createArray());
    }

    public static double[] calculateDistance(int[][] point) {
        double[] distance = new double[calculateVariation(point)];
        for (int i = 0; i < point.length - 1; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = i; k < distance.length; k++) {
                    distance[k] = Math.sqrt((Math.pow((point[i + 1][j] - point[i][j]), 2)) + (Math.pow((point[i + 1][j + 1] - point[i][j + 1]), 2)));
                    //AB = √(xb - xa)2 + (yb - ya)2
                }
            }
        }
        System.out.println(Arrays.toString(distance));
        return distance;
    }

    public static void findMaxDistance(double[] array) {
        double maxDistance = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxDistance) {
                maxDistance = array[i];
            }
        }
        System.out.println(maxDistance);
    }

    public static int calculateVariation(int[][] array) {
        return calculateFactorial(array.length) / (2 * (calculateFactorial(array.length - 2)));
    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


}
