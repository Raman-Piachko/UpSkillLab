package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        crateNewArray();
    }

    public static void crateNewArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 2);
        }
        System.out.println(Arrays.toString(array));
        int minElement = array[0];
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] <= minElement) {
                minElement = array[i];
            }
        }
        int countMinIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == minElement) {
                countMinIndex++;
            }
        }
        int[] newArray = new int[arrayLength - countMinIndex];
        int indexResult = 0;
        for (int j : array) {
            if (j != minElement) {
                newArray[indexResult] = j;
                indexResult++;

            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
