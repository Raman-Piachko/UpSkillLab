package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createSquareMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = createSquareMatrix();
        fillMatrix(matrix);
        printDiagonalElements(matrix);
    }

    public static void printDiagonalElements(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.printf("%d  ", matrix[i][j]);
                }
            }
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == matrix.length - 1 - j) {
                    System.out.printf("%d  ", matrix[i][j]);
                }
            }
        }
    }
}
