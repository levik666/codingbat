package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTwoTest {

    private FirstTwo testInstance;
    private String inputString;
    private String expectedResult;


    @Before
    public void setUp() throws Exception {
        testInstance = new FirstTwo();
    }

    @Test
    public void test1() throws Exception {
        inputString = "Hello";
        expectedResult = "He";
        String actualResult = testInstance.firstTwo(inputString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() throws Exception {
        inputString = "H";
        expectedResult = "H";
        String actualResult = testInstance.firstTwo(inputString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test3() throws Exception {
        inputString = "";
        expectedResult = "";
        String actualResult = testInstance.firstTwo(inputString);

        assertEquals(expectedResult, actualResult);
    }
}
