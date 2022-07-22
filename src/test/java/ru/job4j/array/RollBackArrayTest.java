package ru.job4j.array;

import org.junit.Test;

import static ru.job4j.array.RollBackArray.*;
import static org.junit.Assert.*;

public class RollBackArrayTest {

    @Test
    public void whenEmpty() {
        int[] input = new int[]{};
        int[] expected = new int[]{};
        int[] result = rollback(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenOne() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        int[] result = rollback(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenFull() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{4, 3, 2, 1};
        int[] result = rollback(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTheSame() {
        int[] input = new int[]{1, 1, 1, 1};
        int[] expected = new int[]{1, 1, 1, 1};
        int[] result = rollback(input);
        assertArrayEquals(expected, result);
    }
}