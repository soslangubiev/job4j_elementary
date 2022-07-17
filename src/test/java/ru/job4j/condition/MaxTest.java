package ru.job4j.condition;

import org.junit.Test;

import static ru.job4j.condition.Max.*;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax10To5Then10() {
        int left = 10;
        int right = 5;
        int result = max(left, right);
        int expected = 10;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax22To22Then22() {
        int left = 22;
        int right = 22;
        int result = max(left, right);
        int expected = 22;
        assertEquals(result, expected);
    }
}