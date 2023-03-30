package com.devxschool;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;

public class MainTestTest {

    @Test
    public void mainTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MainTest.main(new String[0]);

        String beforeRandom = "DevXSchool Application Test Base\n" +
                "DevXSchool Application Test Base\n" +
                "DevXSchool Application Test Base\n" +
                "\n" +
                "Base Test Configurations\n" +
                "Backend Test Configurations\n" +
                "Here I would add some backend configurations for database and other connections\n" +
                "UI Test Configurations\n" +
                "Here I would add some cool UI configurations for browser\n" +
                "\n" +
                "com.devxschool.TestBase@64\n" +
                "\n" +
                "app name: DevXSchool Application Test Base\n" +
                "test id: 100\n" +
                "config: Backend Test Configurations\n" +
                "\n" +
                "app name: DevXSchool Application Test Base\n" +
                "test id:";

        String afterRandom = "is randomly generated in TestBase class\n" +
                "config: UI Test Configurations\n" +
                "\n" +
                "false\n" +
                "true\n" +
                "false";

        String messageBefore = "Output of main method contains before randomly generated test id: \nExpected:\n" + beforeRandom + "\n\nActual: \n" + out;
        String messageAfter = "Output of main method contains after randomly generated test id: \nExpected:\n" + afterRandom + "\n\nActual: \n" + out;

        assertTrue(messageBefore, out.toString().contains("DevXSchool Application Test Base"));
        assertTrue(messageBefore, out.toString().contains("Base Test Configurations"));
        assertTrue(messageBefore, out.toString().contains("Backend Test Configurations"));
        assertTrue(messageBefore, out.toString().contains("Here I would add some backend configurations for database and other connections"));
        assertTrue(messageBefore, out.toString().contains("UI Test Configurations"));
        assertTrue(messageBefore, out.toString().contains("Here I would add some cool UI configurations for browser"));
        assertTrue(messageBefore, out.toString().contains("com.devxschool.TestBase@64"));
        assertTrue(messageBefore, out.toString().contains("app name: DevXSchool Application Test Base"));
        assertTrue(messageBefore, out.toString().contains("test id: 100"));
        assertTrue(messageBefore, out.toString().contains("config: Backend Test Configurations"));
        assertTrue(messageBefore, out.toString().contains("app name: DevXSchool Application Test Base"));

        assertTrue(messageAfter, out.toString().contains("is randomly generated in TestBase class"));
        assertTrue(messageAfter, out.toString().contains("config: UI Test Configurations"));
        assertTrue(messageAfter, out.toString().contains("config: UI Test Configurations"));
        assertTrue(messageAfter, out.toString().replace("\n", "").replace("\r", "").contains("false" + "true" + "false"));
    }
}
