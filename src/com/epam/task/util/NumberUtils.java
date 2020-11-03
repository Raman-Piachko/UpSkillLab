package com.epam.task.util;

public class NumberUtils {

    public static boolean isOdd(int digit) {
        return ((digit + 1) % 2 == 0);
    }

    public static boolean isMultipleNumber(int number, int divisor) {
        return (number % divisor == 0);
    }


}
