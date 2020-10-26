package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;


public class Task4 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        changeMaxMin(array);
    }

    public static void changeMaxMin(int[] array) {
        System.out.println(Arrays.toString(array));
        int maxElement = array[0];
        int minElement = array[0];
        for (int j : array) {
            if (j >= maxElement) {
                maxElement = j;
            } else if (j <= minElement) {
                minElement = j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxElement) {
                array[i] = minElement;
            } else if (array[i] == minElement) {
                array[i] = maxElement;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
