package com.devxschool;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestBaseTest {

    int testId = 100;

    String appName = "DevXSchool Application Test Base";

    TestBase testBase = new TestBase();

    @Test
    public void getAppName() {
        assertEquals("Validating app name", appName, testBase.getAppName());
    }

    @Test
    public void initializeTestConfigurations() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        testBase.initializeTestConfigurations();

        TestCase.assertEquals("Incorrect message for initializeTestConfigurations method",
                "Base Test Configurations", out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void hashCodeTest() {
        assertEquals("Test id should match", testBase.getAppName(), testId);
    }
}
