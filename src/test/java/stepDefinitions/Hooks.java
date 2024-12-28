package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import utility.TestContextUI;

public class Hooks {
    // This method will run before each scenario
    TestContextUI testContextUI;
    public Hooks(TestContextUI testContextUI){
        this.testContextUI = testContextUI;
    }

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario: Initializing setup, e.g., opening a browser.");
        // Perform setup tasks here (e.g., open a browser, set up a database, etc.)
        WebDriver driver = new SafariDriver();
        // execute in Chrome Driver - in MAC
//        WebDriver driver = new ChromeDriver();

        // execute in Chrome Driver - in Window
//        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        testContextUI.setDriver(driver);
    }

    // This method will run after each scenario
    @After
    public void afterScenario() {
        System.out.println("After Scenario: Cleaning up, e.g., closing a browser.");
        // Perform cleanup tasks here (e.g., closing browser, clearing data, etc.)
        testContextUI.getDriver().quit();
    }
}
