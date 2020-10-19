package com.epam.task.entity;

import java.util.Objects;

public class Point {
    private double firstAngle;
    private double secondAngle;

    public Point(double firstAngle, double secondAngle) {
        this.firstAngle = firstAngle;
        this.secondAngle = secondAngle;
    }

    public double getFirstAngle() {
        return firstAngle;
    }

    public void setFirstAngle(double firstAngle) {
        this.firstAngle = firstAngle;
    }

    public double getSecondAngle() {
        return secondAngle;
    }

    public void setSecondAngle(double secondAngle) {
        this.secondAngle = secondAngle;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + firstAngle +
                ", y=" + secondAngle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.firstAngle, firstAngle) == 0 &&
                Double.compare(point.secondAngle, secondAngle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstAngle, secondAngle);
    }

}
