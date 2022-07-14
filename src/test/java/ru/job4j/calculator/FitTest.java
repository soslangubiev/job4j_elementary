package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.calculator.Fit.*;

public class FitTest {

    @Test
    public void whenMan187Then100dat05() {
        short in = 187;
        double expected = 100.05;
        double actual = manWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWoman187Then88dat55() {
        short in = 187;
        double expected = 88.55;
        double actual = womanWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }
}