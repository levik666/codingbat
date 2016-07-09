package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraEndTest {

    private ExtraEnd testInstance;
    private String inputString;
    private String expectedResult;


    @Before
    public void setUp() throws Exception {
        testInstance = new ExtraEnd();
    }

    @Test
    public void shouldBeTheSame() throws Exception {
        inputString = "Hello";
        expectedResult = "lololo";
        String actualResult = testInstance.extraEnd(inputString);

        assertEquals(expectedResult, actualResult);
    }
}
