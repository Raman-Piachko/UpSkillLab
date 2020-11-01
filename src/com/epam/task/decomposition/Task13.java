package com.epam.task.decomposition;

import static com.epam.task.arrays.Task6.isPrimeNumber;

public class Task13 {
    public static void main(String[] args) {
        findTwinsNumbers(41);
    }

    public static void findTwinsNumbers(int number) {

        for (int i = number; i <= number * 2; i++) {
            for (int j = i; j < number * 2; j++) {
                if ( j - i == 2 && isPrimeNumber(i)&&isPrimeNumber(j)){
                    System.out.println(i + "  " + j);
                }
            }
        }
    }
}
