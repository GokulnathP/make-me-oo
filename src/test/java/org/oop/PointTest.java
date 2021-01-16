package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        double expectedDistance = 0;

        double distance = origin.distance(origin);

        Assertions.assertEquals(expectedDistance, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        int expectedDistance = 1;
        double distance;

        distance = origin.distance(point1);
        Assertions.assertEquals(expectedDistance, distance);

        distance = origin.distance(point2);
        Assertions.assertEquals(expectedDistance, distance);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        double expectedDistance = 2;

        double distance = point1.distance(point2);

        Assertions.assertEquals(expectedDistance, distance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        double expectedDirection = 0;
        double direction;

        direction = origin.direction(point1);
        Assertions.assertEquals(expectedDirection, direction);

        direction = origin.direction(point2);
        Assertions.assertEquals(0, direction);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        double expectedDirection = Math.PI;
        double direction;

        direction = origin.direction(point1);
        Assertions.assertEquals(expectedDirection, direction);

        direction = origin.direction(point2);
        Assertions.assertEquals(expectedDirection, direction);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double expectedDirection = Math.PI / 2;
        double direction;

        direction = origin.direction(point1);
        Assertions.assertEquals(expectedDirection, direction);

        direction = origin.direction(point2);
        Assertions.assertEquals(expectedDirection, direction);
    }
}
