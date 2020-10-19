package com.epam.task.cycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculateValue());
    }

    public static int calculateValue() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int segmentEnd = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < segmentEnd; i++) {
            sum += i;
        }
        return sum;
    }
}
