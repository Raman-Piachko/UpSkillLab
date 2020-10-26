package com.epam.task.arrays;

import java.util.Arrays;

import static com.epam.task.util.ArrayUtil.createArray;
import static com.epam.task.util.ArrayUtil.fillArray;

public class Task7 {
    public static void main(String[] args) {
        int[] array = fillArray(createArray());
        calculateMaxSum(array);
    }

    public static void calculateMaxSum(int[] array) {    //я выводил наибольшую сумму из сумм крайних элементов и к середине массива
        System.out.println(Arrays.toString(array));
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            int temp = array[i] + array[array.length - 1 - i];
            if (temp >= maxSum) {
                maxSum = temp;
            }
        }
        System.out.println(maxSum);
    }
}
