package com.epam.task.util;

import com.epam.task.entity.Point;

public class PointsUtil {
    public static boolean arePointsOnLine(Point firstPoint, Point secondPoint, Point thirdPoint) {
        return ((thirdPoint.getFirstAngle() - firstPoint.getFirstAngle()) / (secondPoint.getFirstAngle() - firstPoint.getFirstAngle()) == (thirdPoint.getSecondAngle() - firstPoint.getSecondAngle()) / (secondPoint.getSecondAngle() - firstPoint.getSecondAngle()));
    }
}
