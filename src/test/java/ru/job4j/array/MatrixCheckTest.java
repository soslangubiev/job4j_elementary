package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.MatrixCheck.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = monoHorizontal(input, row);
        assertTrue(result);
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        int row = 0;
        boolean result = monoHorizontal(input, row);
        assertFalse(result);
    }
}