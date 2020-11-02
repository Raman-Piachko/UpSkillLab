package com.epam.task.decomposition;

import static com.epam.task.util.NumberUtils.createArrayDigitsOfNumberWithoutDuplicates;

public class Task11 {
    public static void main(String[] args) {
        compareNumberOfDigitsInNumber(1232, 1234);
    }

    public static void compareNumberOfDigitsInNumber(int a, int b) {
        int[] digitsOfFirstNumber = createArrayDigitsOfNumberWithoutDuplicates(a);
        int[] digitsOfSecondNumber = createArrayDigitsOfNumberWithoutDuplicates(b);
        if (digitsOfFirstNumber.length > digitsOfSecondNumber.length) {
            System.out.println("The number of digits in the first number is greater");
        } else if (digitsOfFirstNumber.length < digitsOfSecondNumber.length) {
            System.out.println("The number of digits in the second number is greater");
        } else {
            System.out.println("The number of digits in numbers are equal");
        }
    }
}
