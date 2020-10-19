package com.epam.task.branching;

import com.epam.task.entity.Point;
import com.epam.task.util.PointsUtil;

public class Task3 {

    public static void main(String[] args) {
        Point firstPoint = new Point(1, 1);
        Point secondPoint = new Point(2, 2);
        Point thirdPoint = new Point(4, 4);
        System.out.println(PointsUtil.arePointsOnLine(firstPoint, secondPoint, thirdPoint));
    }

}
