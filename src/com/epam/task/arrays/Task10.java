package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        removeEvenElementsInArray();
    }

    public static void removeEvenElementsInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i = i + 2) {
            array[i] = (random.nextInt(10) + 2);
        }
        System.out.println(Arrays.toString(array));
        int index = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[index] = array[i];
            index++;
            if (i <= index) {
                array[index] = array[i];
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


