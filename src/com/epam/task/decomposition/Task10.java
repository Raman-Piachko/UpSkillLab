package com.epam.task.decomposition;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.filterArrayWithoutDuplicates;

public class Task10 {
    public static void main(String[] args) {
        int[] array = createArrayDigitsOfNumberWithoutDuplicates(1232155);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArrayDigitsOfNumberWithoutDuplicates(int number) {
        int[] digitsArray = new int[calculateLengthOfNumber(number)];

        while (number > 0) {
            for (int i = digitsArray.length - 1; i >= 0; i--) {
                int digit = number % 10;
                number /= 10;
                digitsArray[i] = digit;
            }
        }

        return filterArrayWithoutDuplicates(digitsArray);
    }

    public static int calculateLengthOfNumber(int number) {
        int length = 0;
        long temp = 1;

        while (temp <= number) {
            length++;
            temp *= 10;
        }

        return length;
    }
}
