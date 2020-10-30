package com.epam.task.decomposition;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(calculateFactorialSum(10));
    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int calculateFactorialSum(int n) {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if ((i + 1) % 2 == 0) {
                sum += calculateFactorial(i);
            }
        }
        return sum;
    }
}
