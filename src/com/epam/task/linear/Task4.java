package com.epam.task.linear;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(swapPartsOfNumber(123.456));
        System.out.println(swapPartsOfNumberByString(123.456));
    }

    public static double swapPartsOfNumber(double a) {
        return (a * 1000) % 1000 + (int) a / 1000.0;
    }

    public static double swapPartsOfNumberByString(double a) {
        String stringOfNumbers = Double.toString(a);
        String[] oldNum = stringOfNumbers.split("\\.");
        String[] newNum = new String[oldNum.length];
        for (int i = oldNum.length - 1; i > 0; ) {
            for (int j = 0; j < oldNum.length; j++) {
                newNum[j] = oldNum[i];
                i--;
            }
        }
        return Double.parseDouble(newNum[0] + "." + newNum[1]);
    }
}
