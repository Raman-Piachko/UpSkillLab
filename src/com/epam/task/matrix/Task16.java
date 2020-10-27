package com.epam.task.matrix;

import static com.epam.task.util.MatrixUtils.createSquareMatrix;
import static com.epam.task.util.MatrixUtils.printMatrix;


public class Task16 {
    public static void main(String[] args) {
        int[][] matrix = createSquareMatrix();
        fillMagicMatrix(matrix);
        printMatrix(matrix);
    }

    public static void fillMagicMatrix(int[][] dimArray) {
        int sum = dimArray.length * (dimArray.length * dimArray.length + 1) / 2;
        if ((dimArray.length + 1) % 2 == 0) {
            fillMagicMatrixForOdd(dimArray);
        }
        if (dimArray.length % 4 == 0) {
            fillMagicMatrixForDoubleEven(dimArray);
        }
        if ((dimArray.length % 2 == 0) && (dimArray.length % 4 != 0)) {
            fillMagicMatrixForSingleEven(dimArray);
        }
        System.out.printf("Sum of elements = %d", sum);
    }
    // 1.Позиция следующего числа вычисляется путем уменьшения номера строки предыдущего числа на 1 и увеличения
    // номера столбца предыдущего числа на 1. В любое время, если вычисленная позиция строки становится -1, она будет
    // перенесена на n- 1. Точно так же, если вычисляемая позиция столбца становится n, она возвращается к 0.
    // 2.Если магический квадрат уже содержит число в вычисленной позиции, вычисляемая позиция столбца будет уменьшена
    // на 2, а вычисленная позиция строки будет увеличена на 1.
    // 3.Если вычисленная позиция строки равна -1, а вычисленная позиция столбца равна n, новая позиция будет: (0, n-2).

    public static void fillMagicMatrixForOdd(int[][] matrix) {

        int i = matrix.length / 2; //поиск места
        int j = matrix.length - 1; // где расположена 1

        for (int num = 1; num <= matrix.length * matrix.length; ) {
            if (i == -1 && j == matrix.length) // третье условие
            {
                i = 0;
                j = matrix.length - 2;

            } else {
                if (i < 0) {               // если следующие число выходит за верхнюю сторону квадрата
                    i = matrix.length - 1; //см. первое условие
                }
                if (j == matrix.length) {  //если следующее число выходит за пределы правой стороны квадрата
                    j = 0;                 //см первое условие
                }
            }

            if (matrix[i][j] != 0) {       //второе условие
                j -= 2;
                i++;
                continue;
            } else {
                matrix[i][j] = num++;
            }

            i--;//первое
            j++;//условие

        }

    }

    public static void fillMagicMatrixForDoubleEven(int[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                matrix[i][j] = (matrix.length * i) + j + 1;
            }
        }
        //изменяем значение элементов массива в месте исправления согласно правилу
        //(n * n + 1) -arr [i] [j]
        // Верхний левый угол
        // для порядка (n/4)*(n/4)
        for (i = 0; i < matrix.length / 4; i++) {
            for (j = 0; j < matrix.length / 4; j++) {
                matrix[i][j] = (matrix.length * matrix.length + 1) - matrix[i][j];
            }
        }

        // Верхний левый угол
        // для порядка (n/4)*(n/4))
        for (i = 0; i < matrix.length / 4; i++) {
            for (j = 3 * (matrix.length / 4); j < matrix.length; j++) {
                matrix[i][j] = (matrix.length * matrix.length + 1) - matrix[i][j];
            }
        }
        // Нижний левый угол
        // для порядка (n/4)*(n/4))
        for (i = 3 * matrix.length / 4; i < matrix.length; i++) {
            for (j = 0; j < matrix.length / 4; j++) {
                matrix[i][j] = (matrix.length * matrix.length + 1) - matrix[i][j];
            }
        }
        // Нижний левый угол
        // для порядка (n/4)*(n/4))
        for (i = 3 * matrix.length / 4; i < matrix.length; i++) {
            for (j = 3 * matrix.length / 4; j < matrix.length; j++) {
                matrix[i][j] = (matrix.length * matrix.length + 1) - matrix[i][j];
            }
        }
        // центра матрицы для порядка (n/2)*(n/2))
        for (i = matrix.length / 4; i < 3 * matrix.length / 4; i++) {
            for (j = matrix.length / 4; j < 3 * matrix.length / 4; j++) {
                matrix[i][j] = (matrix.length * matrix.length + 1) - matrix[i][j];
            }
        }

    }

    public static void fillMagicMatrixForSingleEven(int[][] matrix) {
        int halfLength = matrix.length / 2; //размеры подквадратов АВСD
        int k = (matrix.length - 2) / 4; // выступы в подквадратах А и D
        int temp;

        int[] swapCol = new int[matrix.length]; // столбцы, которые нужно менять местами между C-B и A-D
        int index = 0; // индекс изменяемой колонки

        int[][] miniMagic = new int[halfLength][halfLength];
        fillMagicMatrixForOdd(miniMagic);    //создание нечетного магического квадрата А

        //заполняем четрые миниквадрата
        for (int i = 0; i < halfLength; i++) {
            for (int j = 0; j < halfLength; j++) {
                matrix[i][j] = miniMagic[i][j];              //квадрат А
                matrix[i + halfLength][j + halfLength] = miniMagic[i][j] + halfLength * halfLength;   //квадрат В
                matrix[i][j + halfLength] = miniMagic[i][j] + 2 * halfLength * halfLength;       //квадрат C
                matrix[i + halfLength][j] = miniMagic[i][j] + 3 * halfLength * halfLength;       //квадрат D
            }
        }

        for (int i = 1; i <= k; i++) {
            swapCol[index++] = i;
        }
        for (int i = matrix.length - k + 2; i <= matrix.length; i++) {
            swapCol[index++] = i;
        }
        //обмен значениями по известным столбцам С-В А-D
        for (int i = 1; i <= halfLength; i++) {
            for (int j = 1; j <= index; j++) {
                temp = matrix[i - 1][swapCol[j - 1] - 1];
                matrix[i - 1][swapCol[j - 1] - 1] = matrix[i + halfLength - 1][swapCol[j - 1] - 1];
                matrix[i + halfLength - 1][swapCol[j - 1] - 1] = temp;
            }
        }
        //меняем выступы
        temp = matrix[k][0];
        matrix[k][0] = matrix[k + halfLength][0];
        matrix[k + halfLength][0] = temp;

        temp = matrix[k + halfLength][k];
        matrix[k + halfLength][k] = matrix[k][k];
        matrix[k][k] = temp;
    }
}


