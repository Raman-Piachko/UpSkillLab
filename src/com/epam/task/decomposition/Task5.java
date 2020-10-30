package com.epam.task.decomposition;

import java.util.Arrays;

import static com.epam.task.sorting.Task3.bubbleSort;
import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task5 {
    public static void main(String[] args) {
        int[] array = createArray();
        fillArray(array);
        System.out.println(Arrays.toString(array));
        findPreviousMaxElement(array);
    }

    public static void findPreviousMaxElement(int[] array) {
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < array[array.length - 1]) {
                System.out.printf("Previous max element = %d", array[i]);
                break;
            }
        }
    }
}
