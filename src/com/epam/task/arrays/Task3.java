package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        calculateValue();
    }

    public static void calculateValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) - 1);
        }
        int zeroCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int j : array) {
            if (j == 0) {
                zeroCounter++;
            } else if (j > 0) {
                positiveCounter++;
            } else negativeCounter++;
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Negative numbers - %d, zero - %d, positive numbers - %d", negativeCounter, zeroCounter, positiveCounter);
    }
}
