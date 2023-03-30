package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class UIConfigTest {

    TestBase uiConfig = new UIConfig();

    @Test
    public void appNameTest() {
        assertEquals("Checking app name", "DevXSchool Application Test Base", uiConfig.getAppName());
    }

    @Test
    public void initializeTestConfigurationsTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        uiConfig.initializeTestConfigurations();

        assertEquals("Incorrect message for initializeTestConfigurations method",
                "UI Test Configurations" +
                        "Here I would add some cool UI configurations for browser", out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void hashCodeTest() {
        assertNotEquals("Hashcode method test", 100, uiConfig.hashCode());
    }

    @Test
    public void equalsTest() {
        assertFalse("Equals method test", uiConfig.equals(100));
    }

    @Test
    public void toStringTest() {
        String beforeRandom = "\napp name: " + "DevXSchool Application Test Base" +
                "\ntest id: ";
        assertTrue("To string method contains before generated value:  \nExpected:\n" + beforeRandom + "\n\nActual: \n" + uiConfig.toString(),
                uiConfig.toString().contains(beforeRandom));

        String afterRandom = " is randomly generated in TestBase class\n" +
                "config: UI Test Configurations";
        assertTrue("To string method contains after generated value:  \nExpected:\n" + afterRandom + "\n\nActual: \n" + uiConfig.toString(),
                uiConfig.toString().contains(afterRandom));
    }
}
