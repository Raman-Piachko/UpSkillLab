package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createMatrix;
import static com.epam.task.util.MatrixUtils.fillMatrix;

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(); //height-10, width-20
        fillMatrix(matrix);             //limit-15, difference-0
        findLinesWithFiveMoreThreeTimes(matrix);
    }

    public static void findLinesWithFiveMoreThreeTimes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(i);
            }
        }
    }
}

