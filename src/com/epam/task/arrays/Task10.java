package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task10 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        removeEvenElementsInArray(array);
    }

    public static void removeEvenElementsInArray(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }

        int index = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[index] = array[i];
            index++;
            if (i > index) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


