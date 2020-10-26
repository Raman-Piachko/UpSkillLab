package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;
import static com.epam.task.util.InputUtils.inputIntValue;

public class Task1 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        calculateValue(array);
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
