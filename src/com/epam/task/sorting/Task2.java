package com.epam.task.sorting;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.*;

public class Task2 {
    public static void main(String[] args) {
        int[] array = createArray();
        fillArray(array);
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            swapElement(array, i, minIndex);
        }
    }

}
