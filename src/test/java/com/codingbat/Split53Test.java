package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Split53Test {

    private int[] inputString;
    private boolean expectedResult;

    private Split53 testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new Split53();
    }

    @Test
    public void shouldFindMaxMirrorCase1() throws Exception {
        inputString = new int []{1, 1};
        expectedResult = true;
        boolean actualResult = testInstance.split53(inputString);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxMirrorCase2() throws Exception {
        inputString = new int []{1, 1, 1};
        expectedResult = false;
        boolean actualResult = testInstance.split53(inputString);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxMirrorCase3() throws Exception {
        inputString = new int []{2, 4, 2};
        expectedResult = true;
        boolean actualResult = testInstance.split53(inputString);

        assertTrue(expectedResult == actualResult);
    }
}
