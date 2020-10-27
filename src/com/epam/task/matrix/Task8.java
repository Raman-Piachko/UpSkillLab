package com.epam.task.matrix;

import static com.epam.task.util.InputUtils.inputIntValue;
import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;


public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        fillMatrix(matrix);
        System.out.println();
        replaceColumns(matrix);
    }

    public static void replaceColumns(int[][] matrix) {
        int firstColumn = inputIntValue("Enter first column number: ");
        int secondColumn = inputIntValue("Enter second column number: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (firstColumn < secondColumn) {
                    if (j == firstColumn) {
                        int b = matrix[i][j];
                        matrix[i][j] = matrix[i][secondColumn];
                        matrix[i][secondColumn] = b;
                    }
                }
                if (firstColumn > secondColumn) {
                    if (j == secondColumn) {
                        int b = matrix[i][j];
                        matrix[i][j] = matrix[i][firstColumn];
                        matrix[i][firstColumn] = b;
                    }
                }
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
