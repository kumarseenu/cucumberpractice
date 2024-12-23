package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class LoginSteps {
    // Simulating a dummy login process
    WebDriver driver;
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // This is where you could set up your web page or environment for the test
        // For now, it's just a placeholder in this simple example
        System.out.println("User is on the login page.");
//        System.setProperty("webdriver.chrome.driver","Driver Path");
        driver = new SafariDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("the user enters a valid username and password")
    public void the_user_enters_a_valid_username_and_password() {
        System.out.println("the user enters a valid username and password");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("the user enters a valid {string} and {string}")
    public void the_user_enters_a_valid_username_and_password_outline(String username, String password) {
        System.out.println("the user enters a valid username and password");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("the user enters an invalid username and password")
    public void the_user_enters_an_invalid_username_and_password() {
        System.out.println("the user enters an invalid username and password");
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        // Verify that login was successful
        System.out.println("the user should be logged in successfully");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl"+ currentUrl);
        if (currentUrl.contains("practice-test-login/")){
            throw new RuntimeException("User has not logged in");
        }
        else{
            assert true;
        }
        driver.quit();
    }

    @Then("the user should see {string}")
    public void the_user_should_be_logged_in_successfully_outline(String result) {
        // Verify that login was successful
        System.out.println("the user should be logged in successfully");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl"+ currentUrl);
        if (currentUrl.contains(result)){
            assert true;
        }
        else{
            assert false;
        }
        driver.quit();
    }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        // Verify that an error message is shown for invalid credentials
        System.out.println("the user should see an error message");
        System.out.println("the user should be logged in successfully");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl"+ currentUrl);
        if (currentUrl.contains("practice-test-login/")){
            assert false;
        }
        else{
            assert true;
        }
        driver.quit();
    }

    @And("the user clicks on submit button")
    public void the_user_click_on_submit_button() {
        // Verify that an error message is shown for invalid credentials
        System.out.println("the user clicks on submit button");
        driver.findElement(By.id("submit")).click();
    }
}
