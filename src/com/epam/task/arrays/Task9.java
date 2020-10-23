package com.epam.task.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        findPopularNumber();
    }

    public static void findPopularNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
        }
        System.out.println(Arrays.toString(array));
        int popularNumber = array[0];
        int[] countersArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popularNumber = array[j];
                    counter++;
                    countersArray[i] = counter;
                }
            }
        }
        int maxOfCounter = countersArray[0];
        for (int i = 0; i < countersArray.length; i++) {
            if (countersArray[i] >= maxOfCounter) {
                maxOfCounter = countersArray[i];
                popularNumber = array[i];
                for (int j = 0; j < countersArray.length; j++) {
                    if (countersArray[j] == countersArray[i] && countersArray[j] == maxOfCounter) {
                        if (array[i] < array[j] && array[i] <= popularNumber) {
                            popularNumber = array[i];
                        }
                        if (array[i] > array[j]) {
                            popularNumber = array[j];
                        }
                    }
                }
            }
        }
        System.out.println(popularNumber);
    }
}


