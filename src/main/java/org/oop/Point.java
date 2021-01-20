package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double getDistanceBetweenCoordinates(double coordinate1, double coordinate2) {
        return coordinate1 - coordinate2;
    }

    public double distance(Point to) {
        Point from = this;
        double xDistanceSquare = Math.pow(getDistanceBetweenCoordinates(to.x, from.x), 2);
        double yDistanceSquare = Math.pow(getDistanceBetweenCoordinates(to.y, from.y), 2);

        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    public double direction(Point to) {
        Point from = this;
        double xDistance = getDistanceBetweenCoordinates(to.x, from.x);
        double yDistance = getDistanceBetweenCoordinates(to.y, from.y);

        return Math.atan2(yDistance, xDistance);
    }
}
