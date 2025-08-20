package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utility.TestContextUI;

public class Hooks {
    TestContextUI testContextUI;
    public Hooks(TestContextUI testContextUI){
        this.testContextUI = testContextUI;
    }

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario: Initializing setup, e.g., opening a browser.");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // headless for Chrome 109+
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        // Unique user data dir to avoid conflicts
        options.addArguments("--user-data-dir=/tmp/chrome-user-data-" + System.currentTimeMillis());

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practicetestautomation.com/practice-test-login/");
        testContextUI.setDriver(driver);
    }

    @After
    public void afterScenario() {
        System.out.println("After Scenario: Cleaning up, e.g., closing a browser.");
        WebDriver driver = testContextUI.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }
}