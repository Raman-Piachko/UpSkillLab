package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task3 {
    public static void main(String[] args) {
        int[] a = fillArray(createArray());
        calculateValue(a);
    }

    public static void calculateValue(int[] array) {
        int zeroCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int j : array) {
            if (j == 0) {
                zeroCounter++;
            } else if (j > 0) {
                positiveCounter++;
            } else negativeCounter++;
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Negative numbers - %d, zero - %d, positive numbers - %d", negativeCounter, zeroCounter, positiveCounter);
    }
}
