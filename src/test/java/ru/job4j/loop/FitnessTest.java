package ru.job4j.loop;

import org.junit.Test;

import static ru.job4j.loop.Fitness.*;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int result = calc(ivan, nik);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int result = calc(ivan, nik);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int result = calc(ivan, nik);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = calc(ivan, nik);
        int expected = 1;
        assertEquals(expected, result);
    }
}