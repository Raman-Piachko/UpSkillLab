package com.epam.task.util;

import com.epam.task.entity.Point;

public class PointsUtil {
    public static boolean arePointsOnLine(Point firstPoint, Point secondPoint, Point thirdPoint) {
        return ((thirdPoint.getX() - firstPoint.getX()) / (secondPoint.getX() - firstPoint.getX()) == (thirdPoint.getY() - firstPoint.getY()) / (secondPoint.getY() - firstPoint.getY()));
    }
}
