package com.epam.task.decomposition;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;

public class Task12 {

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(fillArrayByExample(array, 7, 128)));
    }

    public static int[] fillArrayByExample(int[] array, int k, int n) {
        int temp = 0;
        int number = 1;
        while (number != n) {
            if (calculateSumOfDigits(number) == k && temp < array.length) {
                array[temp] = number;
                temp++;
            }
            number++;
        }

        return array;
    }

    public static int calculateSumOfDigits(int number) {
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }


}
