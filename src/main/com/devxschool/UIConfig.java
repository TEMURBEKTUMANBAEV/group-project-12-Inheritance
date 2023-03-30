package com.devxschool;

import java.util.Random;

// TODO SETUP THIS CLASS
public class UIConfig extends TestBase {
    private int testId = new Random().nextInt();
    private String configurations = "UI Test Configurations";

    @Override
    public void initializeTestConfigurations() {
        System.out.println("Current configurations: " + configurations);
        System.out.println("Here I would add some cool UI configurations for browser");
    }

    @Override
    public int hashCode() {
        return testId;
    }

    @Override
    public String toString() {
        return "app name: " + this.getAppName() + "\n" +
                "test id: " + testId + " is randomly generated in TestBase class" + "\n" +
                "config: " + configurations;
    }
}