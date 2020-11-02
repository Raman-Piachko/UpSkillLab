package com.epam.task.decomposition;

import java.util.Arrays;

import static com.epam.task.util.NumberUtils.createArrayDigitsOfNumberWithoutDuplicates;

public class Task10 {
    public static void main(String[] args) {
        int[] array = createArrayDigitsOfNumberWithoutDuplicates(1232155);
        System.out.println(Arrays.toString(array));
    }
}
