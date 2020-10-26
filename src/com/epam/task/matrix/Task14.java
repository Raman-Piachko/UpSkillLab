package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;

public class Task14 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrixByExample(matrix);
    }

    public static int[][] fillMatrixByExample(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i >= matrix.length - j) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
}
