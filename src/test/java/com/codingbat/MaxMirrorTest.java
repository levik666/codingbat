package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MaxMirrorTest {

    private int[] inputString;
    private int expectedResult;

    private MaxMirror testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new MaxMirror();
    }

    @Test
    public void shouldFindMaxMirrorCase1() throws Exception {
        inputString = new int []{1, 2, 3, 8, 9, 3, 2, 1};
        expectedResult = 3;
        int actualResult = testInstance.maxMirror(inputString);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxMirrorCase2() throws Exception {
        inputString = new int []{1, 2, 1, 4};
        expectedResult = 3;
        int actualResult = testInstance.maxMirror(inputString);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxMirrorCase3() throws Exception {
        inputString = new int []{7, 1, 2, 9, 7, 2, 1};
        expectedResult = 2;
        int actualResult = testInstance.maxMirror(inputString);

        assertTrue(expectedResult == actualResult);
    }
}
