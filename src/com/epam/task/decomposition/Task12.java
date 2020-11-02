package com.epam.task.decomposition;

import java.util.Arrays;

import static com.epam.task.util.NumberUtils.calculateSumOfDigitsInNumber;
import static java.util.Arrays.copyOf;

public class Task12 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayByExample(7, 40)));
    }

    public static int[] createArrayByExample(int maxSumOfDigits, int maxValueOfNumber) {
        int[] array = new int[maxValueOfNumber];
        int temp = 0;
        int number = 1;
        while (number != maxValueOfNumber) {
            if (calculateSumOfDigitsInNumber(number) == maxSumOfDigits && temp < array.length) {
                array[temp] = number;
                temp++;
            }
            number++;
        }
        return copyOf(array, temp);
    }

}
