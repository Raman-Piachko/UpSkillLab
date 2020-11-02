package com.epam.task.decomposition;

import static com.epam.task.util.NumberUtils.calculateLengthOfNumber;


public class Task14 {

    public static void main(String[] args) {
        findArmstrongNumbers(408);
    }

    public static void findArmstrongNumbers(int finiteNumber) {
        for (int number = 1; number <= finiteNumber; number++) {
            if (raiseDigitsOfNumberToPower(number) == number) {
                System.out.println(number);
            }
        }
    }

    public static int raiseDigitsOfNumberToPower(int number) {
        int power = calculateLengthOfNumber(number);
        int sumOfDigitsOnPower = 0;
        while (number != 0) {
            sumOfDigitsOnPower += Math.pow((number % 10), power);
            number = number / 10;
        }
        return sumOfDigitsOnPower;

    }
}
