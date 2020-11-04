package com.epam.task.decomposition;

public class Task17 {

    public static void main(String[] args) {
        int counter = countIteration(123);
        System.out.println(counter);
    }

    private static int countIteration(int number) {
        int counter = 0;

        do {
            counter++;
            number -= Task12.calculateSumOfDigitsInNumber(number);
        } while (number != 0);

        return counter;
    }
}




