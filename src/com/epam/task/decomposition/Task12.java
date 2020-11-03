package com.epam.task.decomposition;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Task12 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayByExample(7, 40)));
    }

    public static int[] createArrayByExample(int maxSumOfDigits, int maxValueOfNumber) {
        int[] array = new int[maxValueOfNumber];
        int index = 0;
        int numberToFill = 1;

        while (numberToFill != maxValueOfNumber) {
            if (calculateSumOfDigitsInNumber(numberToFill) == maxSumOfDigits && index < array.length) {
                array[index] = numberToFill;
                index++;
            }
            numberToFill++;
        }

        return copyOf(array, index);
    }

    public static int calculateSumOfDigitsInNumber(int number) {
        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }

        return sumOfDigits;
    }
}
