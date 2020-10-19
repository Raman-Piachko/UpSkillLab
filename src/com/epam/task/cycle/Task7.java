package com.epam.task.cycle;


import java.util.Scanner;

public class Task7 {
    public static void findSameNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scanner.nextInt();
        System.out.println("Enter second number ");
        int b = scanner.nextInt();
        while (a > 0) {
            int d = a % 10;
            a /= 10;
            int c = b;
            while (c > 0) {
                int e = c % 10;
                c /= 10;
                if (e == d) {
                    System.out.println("Общая цифра :" + d);
                }
            }
        }
    }

    public static void main(String[] args) {
        findSameNum();
    }
}
