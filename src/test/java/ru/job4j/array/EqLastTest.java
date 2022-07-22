package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.EqLast.*;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        boolean result = check(left, right);
        assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        boolean result = check(left, right);
        assertFalse(result);
    }
}