package com.codingbat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class HelloNameTest {

    private HelloName testInstance;
    private String inputString;
    private String expectedResult;


    @Before
    public void setUp() throws Exception {
        testInstance = new HelloName();
    }

    @Test
    public void shouldBeTheSame() throws Exception {
        inputString = "Bob";
        expectedResult = "Hello Bob!";
        String actualResult = testInstance.helloName(inputString);

        assertEquals(expectedResult, actualResult);
    }
}
