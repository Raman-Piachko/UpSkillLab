package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        System.out.println();
        changeOddElementToMax(matrix, findMax(matrix));
    }

    public static int findMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt >= maxValue) {
                    maxValue = anInt;
                }
            }
        }
        return maxValue;
    }

    public static void changeOddElementToMax(int[][] matrix, int maxValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxValue;
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
