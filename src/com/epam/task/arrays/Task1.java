package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        calculateValue();
    }

    public static void calculateValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10 + 1);
        }
        System.out.println(Arrays.toString(array));
        int result = 0;
        for (int j : array) {
            if (j % divisor == 0) {
                result += j;
            }
        }
        System.out.println(result);
    }
}
