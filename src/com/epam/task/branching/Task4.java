package com.epam.task.branching;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(brickHasValidSize(7, 8, 13, 5, 3));
    }

    public static boolean brickHasValidSize(double openingHeight, double openingWidth, double brickHigh, double brickWidth, double brickLenght) {
        return ((openingHeight > brickHigh) && (openingWidth > brickWidth) || (openingHeight > brickWidth) && (openingWidth > brickHigh) || (openingHeight > openingHeight) && (openingWidth > brickLenght) || (openingHeight > brickLenght) && (openingWidth > openingHeight) || (openingHeight > brickLenght) && (openingWidth > brickWidth) || (openingHeight > brickWidth) && (openingWidth > brickLenght));
    }

}
