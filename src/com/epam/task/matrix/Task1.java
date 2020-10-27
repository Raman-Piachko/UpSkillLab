package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        printOddColumnsWhereFirstElementGreaterLast(matrix);
    }

    public static void printOddColumnsWhereFirstElementGreaterLast(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if ((j + 1) % 2 != 0 && (matrix[0][j] > matrix[matrix.length - 1][j])) {
                    System.out.printf("%d  ", ints[j]);
                }
            }
            System.out.println();
        }
    }
}
