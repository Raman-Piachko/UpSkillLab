package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        calculateMaxSum();
    }

    public static void calculateMaxSum() {    //я выводил наибольшую сумму из сумм крайних элементов и к середине массива
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 2);
        }
        System.out.println(Arrays.toString(array));
        int maxSum = array[0] + array[arrayLength - 1];
        for (int i = 0; i < arrayLength; i++) {
            int temp = array[i] + array[arrayLength - 1 - i];
            if (temp >= maxSum) {
                maxSum = temp;
            }
        }
        System.out.println(maxSum);
    }
}
