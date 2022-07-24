package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.Min.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = new int[]{0, 5, 10};
        int result = findMin(array);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int result = findMin(array);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int result = findMin(array);
        int expected = 2;
        assertEquals(expected, result);
    }
}