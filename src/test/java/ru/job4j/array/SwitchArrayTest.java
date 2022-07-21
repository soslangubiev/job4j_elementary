package ru.job4j.array;

import org.junit.Test;

import static ru.job4j.array.SwitchArray.*;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 3;
        int dest = 4;
        int[] result = swap(input, source, dest);
        int[] expected = {1, 2, 3, 5, 4, 6, 7};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 1;
        int dest = 5;
        int[] result = swap(input, source, dest);
        int[] expected = {1, 6, 3, 4, 5, 2, 7};
        assertArrayEquals(expected, result);
    }
}