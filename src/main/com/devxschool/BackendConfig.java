package com.devxschool;

// TODO SETUP THIS CLASS
public class BackendConfig extends TestBase{
    private String configurations = "Backend Test Configurations";

    @Override
    public void initializeTestConfigurations() {
        System.out.println("Current configurations: " + configurations);
        System.out.println("Here I would add some backend configurations for database and other connections");
    }

    @Override
    public int hashCode() {
        return ;
    }

    @Override
    public String toString() {
        return "app name: " + this.getAppName() + "\n" +
                "test id: " + testId + "\n" +
                "config: " + configurations;
    }

}