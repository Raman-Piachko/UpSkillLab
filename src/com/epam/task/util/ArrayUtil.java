package com.epam.task.util;

import java.util.Random;

import static com.epam.task.util.InputUtils.inputIntValue;

public class ArrayUtil {
    public static int[] fillArray(int[] array) {
        int difference = inputIntValue("Enter random difference ");
        int limit = inputIntValue("Enter random limit ");
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = (random.nextInt(limit) + difference);
        }
        return array;
    }

    public static int[] createArray() {
        int arrayLength = inputIntValue("Enter array length ");
        return new int[arrayLength];
    }

    public static void swapElement(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

}
