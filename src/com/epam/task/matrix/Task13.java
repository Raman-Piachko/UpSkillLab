package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        System.out.println();
        sortMatrixByColumnMax(matrix);
        System.out.println();
        sortMatrixByColumnMin(matrix);
    }


    public static void sortMatrixByColumnMax(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] < matrix[k + 1][j]) {
                        int temp = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = temp;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortMatrixByColumnMin(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] > matrix[k + 1][j]) {
                        int temp = matrix[k + 1][j];
                        matrix[k + 1][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
