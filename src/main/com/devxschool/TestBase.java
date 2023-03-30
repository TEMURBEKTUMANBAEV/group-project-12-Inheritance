package com.devxschool;

// TODO SETUP THIS CLASS
public class TestBase {
    private String appName = "DevXSchool Application Test Base";
    private String configurations = "Base Test Configurations";
    private int testId = 100;

    public String getAppName() {
        return appName;
    }

    public void initializeTestConfigurations() {
        System.out.println("Current configurations: " + configurations);
    }

    @Override
    public int hashCode() {
        return testId;
    }

}
