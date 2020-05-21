package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private App app;

    @Before
    public void setup() {
        app = new App();
    }

    @Test
    public void testCheckForLeapYear() {
        Assert.assertTrue("Should be a leap year", app.checkForLeapYear(2000));
        Assert.assertFalse("Should not be a leap year", app.checkForLeapYear(1700));
        Assert.assertTrue("Should be a leap year", app.checkForLeapYear(2008));
        Assert.assertFalse("Should not be a leap year", app.checkForLeapYear(2017));
    }
}
