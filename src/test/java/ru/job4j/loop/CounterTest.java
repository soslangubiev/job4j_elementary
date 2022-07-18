package ru.job4j.loop;

import org.junit.Test;
import static ru.job4j.loop.Counter.*;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom50To100Then1950() {
        int start = 50;
        int finish = 100;
        int result = sumByEven(start, finish);
        int expected = 1950;
        assertEquals(expected, result);
    }
}