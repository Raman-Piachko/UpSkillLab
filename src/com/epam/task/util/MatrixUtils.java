package com.epam.task.util;

import java.util.Random;

import static com.epam.task.util.InputUtils.inputIntValue;

public class MatrixUtils {
    public static int[][] createMatrix() {
        int height = inputIntValue("Enter height ");
        int width = inputIntValue("Enter width ");
        return new int[height][width];
    }

    public static int[][] createSquareMatrix() {
        int size = inputIntValue("Enter size ");
        return new int[size][size];
    }

    public static int[][] fillMatrix(int[][] matrix) {
        int limit = inputIntValue("Enter random limit ");
        int difference = inputIntValue("Enter random difference ");
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (random.nextInt(limit) + difference);
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.printf("%d  ", j);
            }
            System.out.println();
        }
    }
}
