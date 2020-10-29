package com.epam.task.sorting;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.*;

public class Task3 {
    public static void main(String[] args) {
        int[] array = createArray();
        fillArray(array);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swapElement(array, j - 1, j);
                }
            }
        }
    }

}
