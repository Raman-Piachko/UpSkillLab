package com.epam.task.decomposition;

import static com.epam.task.decomposition.Task15.createArrayOfDigits;
import static com.epam.task.util.NumberUtils.isOdd;

public class Task16 {

    public static void main(String[] args) {
        int sumOfOddDigits = calculateSumOfNumbersWithOnlyOddDigits(1, 7);
        System.out.println(sumOfOddDigits);
        int countEvenDigitsInSumOfOddDigits = countEvenDigitsInNumber(sumOfOddDigits);
        System.out.println(countEvenDigitsInSumOfOddDigits);
    }

    private static int calculateSumOfNumbersWithOnlyOddDigits(int startValue, int endValue) {
        int sum = 0;

        for (int i = startValue; i <= endValue; i++) {
            if (isOddDigitsInNumber(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static int countEvenDigitsInNumber(int number) {
        int[] arrayOfDigits = createArrayOfDigits(number);
        int countEvenDigits = 0;

        for (int arrayOfDigit : arrayOfDigits) {
            if (!isOdd(arrayOfDigit)) {
                countEvenDigits++;
            }
        }

        return countEvenDigits;
    }

    private static boolean isOddDigitsInNumber(int number) {
        int[] arrayOfDigits = createArrayOfDigits(number);
        int countOddDigits = 0;

        for (int arrayOfDigit : arrayOfDigits) {
            if (isOdd(arrayOfDigit)) {
                countOddDigits++;
            }
        }

        return (countOddDigits == arrayOfDigits.length);
    }
}
