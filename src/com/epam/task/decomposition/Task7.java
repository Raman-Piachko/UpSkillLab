package com.epam.task.decomposition;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(calculateSumOfFactorial(10));
    }

    private static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    private static int calculateSumOfFactorial(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if ((i + 1) % 2 == 0) {
                sum += calculateFactorial(i);
            }
        }

        return sum;
    }
}
