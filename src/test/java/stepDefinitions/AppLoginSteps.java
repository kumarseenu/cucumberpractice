package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppLoginSteps {

    @When("the user enters a valid email and password")
    public void the_user_enters_a_valid_email_and_password() {
        System.out.println("the user enters a valid email and password");
    }

    @And("the user clicks on login button")
    public void the_user_click_on_login_button() {
        System.out.println("the user clicks on login button");
    }

    @Then("the user should be logged in successfully to the application")
    public void the_user_login_success() {
        System.out.println("the user should be logged in successfully to the application");
    }
}
