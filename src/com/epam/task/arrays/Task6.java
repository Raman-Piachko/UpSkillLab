package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task6 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        calculateSum(array);
    }

    public static void calculateSum(int[] array) {
        System.out.println(Arrays.toString(array));
        int calculatedSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(i)) {
                calculatedSum += array[i];
            }
        }
        System.out.printf("Sum: %d", calculatedSum);
    }

    public static boolean isPrimeNumber(int x) {
        if (x <= 0 || x == 1)
            return false;
        if (x == 2)
            return true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


}

