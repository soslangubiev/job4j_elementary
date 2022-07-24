package ru.job4j.array;

import org.junit.Test;

import static ru.job4j.array.FindLoop.*;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 10;
        int result = indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = indexInRange(data, el, start, finish);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas4ThenMinus1() {
        int[] data = new int[]{6, 2, 5, 4, 12, 3};
        int el = 4;
        int start = 0;
        int finish = 2;
        int result = indexInRange(data, el, start, finish);
        int expected = -1;
        assertEquals(expected, result);
    }
}