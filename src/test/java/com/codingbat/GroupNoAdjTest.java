package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GroupNoAdjTest {

    private int[] inputString;
    private int start = 0;
    private int target;
    private boolean expectedResult;

    private GroupNoAdj testInstance;

    @Before
    public void setUp() throws Exception {
        testInstance = new GroupNoAdj();
    }

    @Test
    public void shouldFindMaxSpanCase1() throws Exception {
        inputString = new int []{2, 5, 10, 4};
        expectedResult = true;
        target = 12;
        boolean actualResult = testInstance.groupNoAdj(start, inputString, target);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxSpanCase2() throws Exception {
        inputString = new int []{2, 5, 10, 4};
        expectedResult = false;
        target = 14;
        boolean actualResult = testInstance.groupNoAdj(start, inputString, target);

        assertTrue(expectedResult == actualResult);
    }

    @Test
    public void shouldFindMaxSpanCase3() throws Exception {
        inputString = new int []{2, 5, 10, 4};
        expectedResult = false;
        target = 7;
        boolean actualResult = testInstance.groupNoAdj(start, inputString, target);

        assertTrue(expectedResult == actualResult);
    }
}
