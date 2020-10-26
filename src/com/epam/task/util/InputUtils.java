package com.epam.task.util;

import java.util.Scanner;

public class InputUtils {
    public static int inputIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
}
