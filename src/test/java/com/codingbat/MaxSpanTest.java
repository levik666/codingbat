package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MaxSpanTest {

    private int[] inputString;
    private int expectedResult;

    private MaxSpan testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new MaxSpan();
    }

    @Test
    public void shouldFindMaxSpanCase1() throws Exception {
        inputString = new int []{1, 2, 1, 1, 3};
        expectedResult = 4;
        int actualResult = testInstance.maxSpan(inputString);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxSpanCase2() throws Exception {
        inputString = new int []{1, 4, 2, 1, 4, 1, 4};
        expectedResult = 6;
        int actualResult = testInstance.maxSpan(inputString);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxSpanCase3() throws Exception {
        inputString = new int []{1, 4, 2, 1, 4, 4, 4};
        expectedResult = 6;
        int actualResult = testInstance.maxSpan(inputString);

        assertTrue(expectedResult == actualResult);
    }
}
