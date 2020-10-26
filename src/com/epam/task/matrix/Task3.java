package com.epam.task.matrix;

import static com.epam.task.util.InputUtils.inputIntValue;
import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        printValues(matrix);
    }

    public static void printValues(int[][] matrix) {
        int lineNumber = inputIntValue("Enter number of line ");
        int columnNumber = inputIntValue("Enter number of column ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == lineNumber) {
                    System.out.printf("%d  ", matrix[i][j]);
                }
                if (j == columnNumber) {
                    System.out.printf("%d  ", matrix[i][j]);
                }
            }
        }
        System.out.println();

    }
}
