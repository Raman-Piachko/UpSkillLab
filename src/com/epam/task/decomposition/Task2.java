package com.epam.task.decomposition;

import static com.epam.task.decomposition.Task1.findNOD;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findNOD4(15, 30, 90, 120));
    }

    public static int findNOD4(int a, int b, int c, int d) {
        int x = findNOD(a, b);
        int y = findNOD(c, d);
        return findNOD(x, y);
    }
}
