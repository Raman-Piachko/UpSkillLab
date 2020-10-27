package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        System.out.println();
        sortMatrixByLineMax(matrix);
        System.out.println();
        sortMatrixByLineMin(matrix);
    }


    public static void sortMatrixByLineMax(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortMatrixByLineMin(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
