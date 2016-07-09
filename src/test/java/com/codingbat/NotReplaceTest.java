package com.codingbat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NotReplaceTest {

    private NotReplace testInstance;

    private String inputString;
    private String expectedResult;

    public NotReplaceTest(final String inputString, final String expectedResult) {
        this.expectedResult = expectedResult;
        this.inputString = inputString;
    }

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"This is isabell", "This is not isabell"},
                {"", ""},
                {"Dis is bliss is", "Dis is not bliss is not"},
                {"AAAis is", "AAAis is not"},
                {"is his", "is not his"},
                {"xis yis", "xis yis"}
        });
    }

    @Before
    public void setUp() throws Exception {
        testInstance = new NotReplace();
    }

    @Test
    public void shouldChangeIsToIsNot() {
        assertEquals(expectedResult,
                testInstance.notReplace(inputString));
    }

}
