package com.epam.task.cycle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculateSumm());
    }

    public static int calculateSumm() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }
        return sum;
    }
}
