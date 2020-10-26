package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.*;

public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = createSquareMatrix();
        fillMatrix(matrix);
        findPositiveElementsInMainDiagonal(matrix);
    }

    public static void findPositiveElementsInMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.printf("%d ", matrix[i][j]);
                }
            }
        }
    }
}
