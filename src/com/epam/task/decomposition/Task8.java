package com.epam.task.decomposition;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 2, 1, 2};
        System.out.println(Arrays.toString(array));
        calculateSumOfElements(array);
    }

    private static void calculateSumOfElements(int[] array) {
        int sum1 = calculateSumOfThreeElements(0, array);
        int sum2 = calculateSumOfThreeElements(2, array);
        int sum3 = calculateSumOfThreeElements(3, array);

        System.out.printf("Result = %d, %d, %d", sum1, sum2, sum3);
    }

    private static int calculateSumOfThreeElements(int i, int[] array) {
        return array[i] + array[i + 1] + array[i + 2];
    }
}
