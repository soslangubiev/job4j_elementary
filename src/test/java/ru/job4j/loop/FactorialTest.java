package ru.job4j.loop;

import org.junit.Test;
import static ru.job4j.loop.Factorial.*;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int result = calc(in);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int result = calc(in);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int in = 1;
        int result = calc(in);
        int expected = 1;
        assertEquals(expected, result);
    }
}