package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.*;

public class Task1 {
    public static void main(String[] args) {
        int[] a = fillArray(createArray());
        calculateValue(a);
    }

    public static void calculateValue(int[] array) {
        System.out.println(Arrays.toString(array));
        int divisor = inputIntValue("Enter divisor: ");
        int result = 0;
        for (int j : array) {
            if (j % divisor == 0) {
                result += j;
            }
        }
        System.out.println(result);
    }
}
