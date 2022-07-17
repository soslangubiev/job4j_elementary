package ru.job4j.condition;

import org.junit.Test;

import static ru.job4j.condition.Triangle.*;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = exist(ab, ac, bc);
        assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 5;
        double ac = 2;
        double bc = 2;
        boolean result = exist(ab, ac, bc);
        assertFalse(result);
    }
}