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
    public void when0Minus3to72then8dat60() {
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
}
