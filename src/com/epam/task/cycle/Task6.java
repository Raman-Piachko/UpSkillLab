package com.epam.task.cycle;

import java.util.Scanner;

public class Task6 {
    public static void outputDivisiors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start ");
        int m = scanner.nextInt();
        System.out.println("Enter end ");
        int n = scanner.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        outputDivisiors();
    }
}
