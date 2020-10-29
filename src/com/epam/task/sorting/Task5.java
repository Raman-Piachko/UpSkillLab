package com.epam.task.sorting;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task5 {
    public static void main(String[] args) {
        int[] array = createArray();
        fillArray(array);
        System.out.println(Arrays.toString(array));
        sortShellMethod(array);
        System.out.println(Arrays.toString(array));

    }

    public static void sortShellMethod(int[] array) {
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                changeElementShellSort(i, array, step);
            }
        }
    }

    public static void changeElementShellSort(int i, int[] array, int step) {
        for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
            int temp = array[j];
            array[j] = array[j + step];
            array[j + step] = temp;
        }
    }
}
