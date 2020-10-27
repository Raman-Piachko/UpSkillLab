package com.epam.task.matrix;

import static com.epam.task.util.InputUtils.inputIntValue;

public class Task6 {
    public static void main(String[] args) {
        createSquareMatrixByExample();
    }

    public static void createSquareMatrixByExample() {
        int size = inputIntValue("Enter size ");
        if (size % 2 == 0) {
            int[][] matrix = new int[size][size];

            for (int i = 0; i < size / 2; i++) {
                for (int j = 0; j < size; j++) {
                    if (i <= j && j < size - i) {
                        matrix[i][j] = 1;
                    }
                    System.out.printf("%d  ", matrix[i][j]);
                }
                System.out.println();
            }

            for (int i = size / 2; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (j >= size - i - 1 && i >= j) {
                        matrix[i][j] = 1;
                    }
                    System.out.printf("%d  ", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
