package ru.job4j.condition;

import org.junit.Test;

import static ru.job4j.condition.Max.*;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1And2Then2() {
        int first = 1;
        int second = 2;
        int result = max(first, second);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax10And5Then10() {
        int first = 10;
        int second = 5;
        int result = max(first, second);
        int expected = 10;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax22And22Then22() {
        int first = 22;
        int second = 22;
        int result = max(first, second);
        int expected = 22;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax22And42And56Then56() {
        int first = 22;
        int second = 42;
        int third = 56;
        int result = max(first, second, third);
        int expected = 56;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax88And42And56And44Then22() {
        int first = 88;
        int second = 42;
        int third = 56;
        int fourth = 44;
        int result = max(first, second, third, fourth);
        int expected = 88;
        assertEquals(result, expected);
    }
}