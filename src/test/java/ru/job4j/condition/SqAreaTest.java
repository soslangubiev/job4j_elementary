package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP2dot44K5Square0dot20() {
        double expected = 0.20;
        double p = 2.44;
        double k = 5;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP4dot55K5dot55Square0dot66() {
        double expected = 0.66;
        double p = 4.55;
        double k = 5.55;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, 0.01);
    }
}