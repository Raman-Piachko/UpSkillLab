package com.epam.task.decomposition;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(findNod(15, 30, 90, 120));
    }

    private static int findNod(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int nodFirstSecondNumbers = Task1.findNod(firstNumber, secondNumber);
        int nodThirdFourthNumbers = Task1.findNod(thirdNumber, fourthNumber);

        return Task1.findNod(nodFirstSecondNumbers, nodThirdFourthNumbers);
    }
}
