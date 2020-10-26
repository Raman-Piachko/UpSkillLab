package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;
import static com.epam.task.util.InputUtils.inputIntValue;

public class Task2 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        calculateChange(array);
    }

    public static void calculateChange(int[] array) {
        int comparableValue = inputIntValue("Enter comparable value: ");
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > comparableValue) {
                array[i] = comparableValue;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Number of replacements: %d", count);
    }
}
