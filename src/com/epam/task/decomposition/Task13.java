package com.epam.task.decomposition;

import static com.epam.task.arrays.Task6.isPrimeNumber;

public class Task13 {
    public static void main(String[] args) {
        findTwinsNumbers(41);
    }

    private static void findTwinsNumbers(int number) {
        for (int i = number; i <= number * 2; i++) {
            if (isNumberHasTwin(i)) {
                System.out.printf("%d  %d\n", i, i + 2);
            }
        }
    }

    private static boolean isNumberHasTwin(int firstNumber) {
        int secondNumber = firstNumber + 2;
        return (secondNumber - firstNumber == 2 && isPrimeNumber(firstNumber) && isPrimeNumber(secondNumber));
    }
}
