package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        calculateSum();
    }

    public static boolean isPrimeNumber(int x) {
        if (x <= 0 || x == 1)
            return false;
        if (x == 2)
            return true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 2);
        }
        System.out.println(Arrays.toString(array));
        int calculatedSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(i)) {
                calculatedSum += array[i];
            }
        }
        System.out.printf("Sum: %d", calculatedSum);
    }
}

