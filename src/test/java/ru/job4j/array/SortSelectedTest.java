package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.array.SortSelected.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = new int[]{8, 7, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 7, 8};
        assertArrayEquals(expected, result);
    }
}