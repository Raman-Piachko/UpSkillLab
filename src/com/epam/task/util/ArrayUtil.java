package com.epam.task.util;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {
    public static int[] fillArray(int[] array) {
        int difference = inputIntValue("Enter random difference ");
        int limit = inputIntValue("Enter random limit ");
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = (random.nextInt(limit) + difference);
        }
        return array;
    }

    public static int[] createArray() {
        int arrayLength = inputIntValue("Enter array length ");
        return new int[arrayLength];
    }

    public static int inputIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }


}
