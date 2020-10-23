package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 2);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > i) {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
}
