package com.epam.task.matrix;

import static com.epam.task.util.InputUtils.inputIntValue;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Task7 {
    public static void main(String[] args) {
        double[][] matrix = createMatrixByFormula();
        calculateElementsGreaterZero(matrix);
    }

    public static double[][] createMatrixByFormula() {
        int size = inputIntValue("Enter size ");
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sin(((pow(i, 2) - pow(j, 2)) / size));
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
        return matrix;
    }

    public static void calculateElementsGreaterZero(double[][] matrix) {
        int counter = 0;
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (doubles[j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
