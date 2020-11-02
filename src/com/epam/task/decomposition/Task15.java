package com.epam.task.decomposition;

import static com.epam.task.util.NumberUtils.createArrayOfDigits;
import static com.epam.task.util.NumberUtils.isNMultipleNumber;

public class Task15 {

    public static void main(String[] args) {
        findNumbersFormingSequence(12340, 12350, 2);
    }

    public static void findNumbersFormingSequence(int startValue, int finishValue, int divisor) {
        for (int i = startValue; i <= finishValue; i++) {
            if (isNMultipleNumber(i, divisor)) {
                int[] array = createArrayOfDigits(i);
                if (isIncreasing(array)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] >= arr[i - 1]) return false;
        return true;
    }
}

