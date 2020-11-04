package com.epam.task.util;

import java.util.Arrays;
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

    public static void swapElements(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public static int[] filterArrayWithoutDuplicates(int[] array) {
        int lengthOfRepeatingElements = array.length;
        for (int i = 0; i < lengthOfRepeatingElements; i++) {
            for (int j = i + 1; j < lengthOfRepeatingElements; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[lengthOfRepeatingElements - 1];
                    lengthOfRepeatingElements--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, lengthOfRepeatingElements);
    }

}
