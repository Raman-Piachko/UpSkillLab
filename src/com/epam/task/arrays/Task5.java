package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task5 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        printNumbers(array);
    }

    public static void printNumbers(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
}
