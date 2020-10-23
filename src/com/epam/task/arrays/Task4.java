package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        changeMaxMin();
    }

    public static void changeMaxMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) - 2);
        }
        System.out.println(Arrays.toString(array));
        int maxElement = array[0];
        int minElement = array[0];
        for (int j : array) {
            if (j >= maxElement) {
                maxElement = j;
            } else if (j <= minElement) {
                minElement = j;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxElement) {
                array[i] = minElement;
            } else if (array[i] == minElement) {
                array[i] = maxElement;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
