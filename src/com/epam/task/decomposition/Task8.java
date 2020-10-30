package com.epam.task.decomposition;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        int[] array = {2, 1, 2, 2, 1, 2};
        System.out.println(Arrays.toString(array));
        calculateSumThreeElements(array);
    }

    public static void calculateSumThreeElements(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                sum1 = calculateThreeElements(i, array);
            }
            if (i == 2) {
                sum2 = calculateThreeElements(i, array);
            }
            if (i == 3) {
                sum3 = calculateThreeElements(i, array);
            }
        }

        System.out.printf("Result = %d, %d, %d", sum1, sum2, sum3);
    }

    public static int calculateThreeElements(int i, int[] array) {
        return array[i] + array[i + 1] + array[i + 2];
    }

}
