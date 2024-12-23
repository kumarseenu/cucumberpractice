package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    // This method will run before each scenario
    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario: Initializing setup, e.g., opening a browser.");
        // Perform setup tasks here (e.g., open a browser, set up a database, etc.)
    }

    // This method will run after each scenario
    @After
    public void afterScenario() {
        System.out.println("After Scenario: Cleaning up, e.g., closing a browser.");
        // Perform cleanup tasks here (e.g., closing browser, clearing data, etc.)
    }
}
