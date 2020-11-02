package com.epam.task.decomposition;

import static com.epam.task.util.NumberUtils.findNOD;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findNOD4(15, 30, 90, 120));
    }

    public static int findNOD4(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int nodFirstSecondNumbers = findNOD(firstNumber, secondNumber);
        int nodThirdFourthNumbers = findNOD(thirdNumber, fourthNumber);
        return findNOD(nodFirstSecondNumbers, nodThirdFourthNumbers);
    }
}
