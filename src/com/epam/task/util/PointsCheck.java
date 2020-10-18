package com.epam.task.util;

import com.epam.task.entity.Point;

public class PointsCheck {
    public static boolean isPointsOnLine(Point one, Point two, Point three){
        return ((three.getX()- one.getX())/(two.getX()- one.getX())==(three.getY()- one.getY())/(two.getY()- one.getY()));
    }
}
