package com.devxschool;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BackendConfigTest {

    TestBase backendConfig = new TestBase();

    String configurations = "Backend Test Configurations";

    @Test
    public void appNameTest() {
        Assert.assertEquals("Checking app name", "DevXSchool Application Test Base", backendConfig.getAppName());
    }

    @Test
    public void initializeTestConfigurationsTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        backendConfig.toString();

        assertEquals("Incorrect message for initializeTestConfigurations method",
                "Backend Test Configurations" +
                        "Here I would add some backend configurations for database and other connections", out.toString().replace("\n", "").replace("\r", ""));
    }

    @Test
    public void hashCodeTest() {
        assertEquals("Hashcode method test", 100, backendConfig.hashCode());
    }

    @Test
    public void equalsTest() {
        assertTrue("Equals method test", backendConfig.equals(100));
    }

    @Test
    public void toStringTest() {
        String expected = "\napp name: " + "DevXSchool Application Test Base" +
                "\ntest id: " + 100 +
                "\nconfig: " + configurations;
        assertEquals("To string method", expected, backendConfig.toString());
    }
}
