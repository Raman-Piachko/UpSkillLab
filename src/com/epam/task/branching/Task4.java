package com.epam.task.branching;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(checkSize(7,8,13,5,3));
    }

    public static boolean checkSize(double a, double b, double x, double y, double z) {
        return ((a<x)&&(b<y))||((a<x)&&(b<z))||((a<z)&&(b<y));
    }

}
