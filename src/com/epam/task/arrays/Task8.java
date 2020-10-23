package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task8 {
    public static void main(String[] args) {
        int[] a = fillArray(createArray());
        crateNewArrayWithOutMinElements(a);
    }

    public static void crateNewArrayWithOutMinElements(int[] array) {
        System.out.println(Arrays.toString(array));
        int minElement = array[0];
        for (int k : array) {
            if (k <= minElement) {
                minElement = k;
            }
        }

        int countMinIndex = 0;
        for (int k : array) {
            if (k == minElement) {
                countMinIndex++;
            }
        }

        int indexResult = 0;
        int[] newArray = new int[array.length - countMinIndex];
        for (int j : array) {
            if (j != minElement) {
                newArray[indexResult] = j;
                indexResult++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
