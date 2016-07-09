package com.codingbat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxOutWordTest {

    private MakeOutWord testInstance;
    private String inputString1;
    private String inputString2;
    private String expectedResult;


    @Before
    public void setUp() throws Exception {
        testInstance = new MakeOutWord();
    }

    @Test
    public void shouldBeTheSame() throws Exception {
        inputString1 = "Yay";
        inputString2 = "<<>>";
        expectedResult = "<<Yay>>";
        String actualResult = testInstance.makeOutWord(inputString2, inputString1);

        assertEquals(expectedResult, actualResult);
    }
}
