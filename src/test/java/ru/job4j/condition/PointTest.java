package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when0Minus3to72then8dot60() {
        double expected = 8.60;
        Point a = new Point(0, -3);
        Point b = new Point(7, 2);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when174to124then5() {
        double expected = 5.0;
        Point a = new Point(17, 4);
        Point b = new Point(12, 4);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when345to12456then51dot78() {
        double expected = 51.78;
        Point a = new Point(3, 4, 5);
        Point b = new Point(12, 4, 56);
        double actual = a.distance3d(b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when123to579then8dot77() {
        double expected = 8.77;
        Point a = new Point(1, 2, 3);
        Point b = new Point(5, 7, 9);
        double actual = a.distance3d(b);
        assertEquals(expected, actual, 0.01);
    }
}
