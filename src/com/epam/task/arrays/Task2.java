package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        calculateChange();
    }

    public static void calculateChange() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        System.out.print("Enter comparable value: ");
        int comparableValue = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10 + 1);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > comparableValue) {
                array[i] = comparableValue;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Number of replacements: %d", count);
    }
}
