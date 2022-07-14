package ru.job4j.condition;

import org.junit.Test;

import static ru.job4j.condition.Point.*;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double actual = distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when0Minus3to72then8dat60() {
        double expected = 8.60;
        int x1 = 0;
        int y1 = -3;
        int x2 = 7;
        int y2 = 2;
        double actual = distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when174to124then5() {
        double expected = 5.0;
        int x1 = 17;
        int y1 = 4;
        int x2 = 12;
        int y2 = 4;
        double actual = distance(x1, y1, x2, y2);
        assertEquals(expected, actual, 0.01);
    }

}
