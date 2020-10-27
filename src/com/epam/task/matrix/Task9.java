package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task9 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        findMaxColumn(matrix);
    }

    public static void findMaxColumn(int[][] matrix) {
        int[] sums = new int[matrix[0].length];
        int maxColumn = sums[0];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int[] ints : matrix) {
                sums[j] += ints[j];
            }
        }
        int numberOfMaxColumn = 0;
        for (int j = 0; j < sums.length; j++) {
            if (sums[j] >= maxColumn) {
                maxColumn = sums[j];
                numberOfMaxColumn = j;
            }
        }
        System.out.printf("Column with maximum sum is %d", numberOfMaxColumn);
    }
}

