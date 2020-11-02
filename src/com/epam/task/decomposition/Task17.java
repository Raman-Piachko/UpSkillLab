package com.epam.task.decomposition;

import static com.epam.task.util.NumberUtils.calculateSumOfDigitsInNumber;

public class Task17 {

    public static void main(String[] args) {
        int counter = countIteration(123);
        System.out.println(counter);
    }

    public static int countIteration(int number) {
        int counter = 0;
        do {
            counter++;
            number -= calculateSumOfDigitsInNumber(number);
        } while (number != 0);
        return counter;
    }
}




