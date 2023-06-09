package com.devxschool;

public class MainTest {

    public static void main(String[] args) {
        /**
         * There is a parent class - TestBase, that should hold
         *  - 'appName' info as a String "DevXSchool Application Test Base"
         *  - 'getAppName' method, so it can provide application name
         *  - 'configurations' string reference that holds a value of "Base Test Configurations"
         *  - 'initializeTestConfigurations' method, to initialize and print current 'configurations' of a class
         *  - 'testId' integer variable with a value of a 100
         *  - 'hashCode' method that will be overridden from a parent class with the 'testId'
         *
         * Also, there is a BackendConfig class that holds all the information and configurations for backend tests
         *  - add a variable configurations with a value of "Backend Test Configurations"
         *  - override method 'initializeTestConfigurations'
         *      * add a print line current 'configurations'
         *      * add a print line message "Here I would add some backend configurations for database and other connections"
         *  - override method 'hashCode' that returns 'testId'
         *  - override method 'toString' and return information details:
         *      * new line for "app name: " and call getAppName()
         *      * new line for "test id: " get from 'testId'
         *      * new line for "config: " and get from 'configurations'
         *
         * And there is a UIConfig class that holds all the information and configurations for ui tests
         *  - add a variable 'testId' that will be assigned with the randomly generated by a Random class. use: new Random().nextInt();
         *  - add a variable 'configurations' with a value of "UI Test Configurations"
         *  - override method 'initializeTestConfigurations'
         *      * add a print line current 'configurations'
         *      * add a print line message "Here I would add some cool UI configurations for browser"
         *  - override method 'hashCode' that returns 'testId'
         *  - override method 'toString' and return information details:
         *      * new line for "app name: " and call getAppName()
         *      * new line for "test id: " and get from 'testId' and add a message " is randomly generated in TestBase class"
         *      * new line for "config: " and get from 'configurations'
         *
         */
        /**
         * =============================================================================================================
         * TEST IN MAIN CLASS AND ANALYZE IN A GROUP
         * - create 'base' reference of type TestBase and instantiate with TestBase class
         * - create 'backend' reference of type TestBase and instantiate with BackendConfig class
         * - create 'ui' reference of type TestBase and instantiate with UIConfig class
         * 1) app name
         *      - print app name for all variables
         *    * communicate in a group
         *      - explain how app name is there in config classes
         * 2) test id
         *      - print test id for all variables
         *    * communicate in a group
         *      - explain how test ids got their values
         * 3) config
         *      - print an empty line
         *      - call initializeTestConfigurations for all variables
         *    * communicate in a group
         *      - explain how configurations can be set for each class
         * 4) to string
         *      - print an empty line
         *      - print toString method for all variables
         *    * communicate in group
         *      - explain how 'toString' method can be overridden and we don't have it in a parent TestBase class
         *      - explain why base object has printed such a weird line and what does that mean
         * 5) equals
         *      - print an empty line
         *      - create six objects of type TestBase by two instance of TestBase, BackendConfig and UIConfig
         *      - print equals method for all same instances
         *    * communicate in group
         *      - explain how equals method works in TestBase class
         *      - explain how same method implementations in BackendConfig and UIConfig classes have different outputs
         *
         */

        // TODO WRITE CODE HERE

    }
}
