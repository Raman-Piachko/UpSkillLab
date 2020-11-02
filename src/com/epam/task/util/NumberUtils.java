package com.epam.task.util;

import static com.epam.task.util.ArrayUtil.filterArrayWithoutDuplicates;

public class NumberUtils {

    public static int findNOD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int findNOK(int a, int b) {
        return ((a * b) / findNOD(a, b));
    }

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calculateSumOfFactorial(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if ((i + 1) % 2 == 0) {
                sum += calculateFactorial(i);
            }
        }
        return sum;
    }

    public static int calculateLengthOfNumber(int number) {
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }

    public static int[] createArrayDigitsOfNumberWithoutDuplicates(int number) {
        int[] digitsArray = new int[calculateLengthOfNumber(number)];
        while (number > 0) {
            for (int i = digitsArray.length - 1; i >= 0; i--) {
                int l = number % 10;
                number /= 10;
                digitsArray[i] = l;
            }
        }
        return filterArrayWithoutDuplicates(digitsArray);
    }

    public static int calculateSumOfDigitsInNumber(int number) {
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }

    public static boolean isNMultipleNumber(int number, int divisor) {
        return (number % divisor == 0);
    }

    public static int[] createArrayOfDigits(int number) {
        int lengthOfNumber = calculateLengthOfNumber(number);
        int[] arrayOfDigits = new int[lengthOfNumber];
        int temp = 0;
        while (number != 0 && temp < arrayOfDigits.length) {
            arrayOfDigits[temp] = number % 10;
            temp++;
            number = number / 10;
        }
        return arrayOfDigits;
    }


}
