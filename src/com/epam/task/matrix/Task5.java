package com.epam.task.matrix;

import static com.epam.task.util.InputUtils.inputIntValue;

public class Task5 {
    public static void main(String[] args) {
        createSquareMatrixByExample();
    }

    public static void createSquareMatrixByExample() {
        int size = inputIntValue("Enter size ");
        if (size % 2 == 0) {
            int[][] matrix = new int[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    matrix[i][j] = i + 1;
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("%d  ", matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}



