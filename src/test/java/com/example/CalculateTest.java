package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTest {

    @Test
    public void testKnownValue() {
        double a = 5.0;
        double b = 3.0;
        double expected = 100.0 * Math.PI;
        double actual = Calculate.terfogatSzamitas(a, b);
        Assert.assertEquals(actual, expected, 1e-9);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInput() {
        Calculate.terfogatSzamitas(-1.0, 2.0);
    }
}
