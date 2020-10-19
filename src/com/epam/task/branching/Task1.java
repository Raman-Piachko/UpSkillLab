package com.epam.task.branching;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(testTriangle(120, 90));
    }

    public static boolean isTriangle(double firstAngle, double secondAngle) {
        return (180 - firstAngle - secondAngle > 0);
    }

    public static boolean isTriangleRightAngled(double firstAnle, double secondAngle) {
        return (180 - firstAnle - secondAngle == 90);
    }

    public static String testTriangle(double firstAngle, double secondAngle) {
        if (isTriangle(firstAngle, secondAngle)) {
            if (isTriangleRightAngled(firstAngle, secondAngle)) {
                return "It is right triangle";
            }
            return "It is triangle, but it i not right triangle";
        }
        return "It is not triangle";
    }
}


