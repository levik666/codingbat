package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {

    private NonStart testInstance;
    private String inputString1;
    private String inputString2;
    private String expectedResult;


    @Before
    public void setUp() throws Exception {
        testInstance = new NonStart();
    }

    @Test
    public void test1() throws Exception {
        inputString1 = "Hello";
        inputString2 = "There";
        expectedResult = "ellohere";
        String actualResult = testInstance.nonStart(inputString1, inputString2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() throws Exception {
        inputString1 = "shotl";
        inputString2 = "java";
        expectedResult = "hotlava";
        String actualResult = testInstance.nonStart(inputString1, inputString2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test3() throws Exception {
        inputString1 = "java";
        inputString2 = "code";
        expectedResult = "avaode";
        String actualResult = testInstance.nonStart(inputString1, inputString2);

        assertEquals(expectedResult, actualResult);
    }
}
