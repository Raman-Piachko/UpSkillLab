package com.epam.task.decomposition;

import static com.epam.task.decomposition.Task10.calculateLengthOfNumber;
import static com.epam.task.util.NumberUtils.isMultipleNumber;

public class Task15 {

    public static void main(String[] args) {
        findNumbersFormingSequence(12340, 12350, 2);
    }

    private static void findNumbersFormingSequence(int startValue, int finishValue, int divisor) {
        for (int number = startValue; number <= finishValue; number++) {
            if (isFormingNumberSequence(number, divisor)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isFormingNumberSequence(int number, int divisor) {
        if (isMultipleNumber(number, divisor)) {
            int[] array = createArrayOfDigits(number);
            return isIncreasing(array);
        }

        return false;
    }

    public static int[] createArrayOfDigits(int number) {
        int lengthOfNumber = calculateLengthOfNumber(number);
        int[] arrayOfDigits = new int[lengthOfNumber];
        int index = 0;

        while (number != 0 && index < arrayOfDigits.length) {
            arrayOfDigits[index] = number % 10;
            index++;
            number = number / 10;
        }

        return arrayOfDigits;
    }
}

