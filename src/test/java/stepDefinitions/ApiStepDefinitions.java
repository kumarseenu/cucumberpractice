package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class ApiStepDefinitions {

    private Response response;

    // Base URI for the API
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Given("I send a GET request to {string}")
    public void sendGetRequest(String endpoint) {
        // Sending GET request to the endpoint
        response = given()
                .baseUri(BASE_URL)
                .when()
                .get(endpoint)
                .then()
                .extract().response();
    }

    @Then("the status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        // Assert the status code
        assertEquals(expectedStatusCode, response.getStatusCode());
        assertEquals(1,2);
    }

    @Then("the response should contain {string} and {string}")
    public void verifyResponseContainsFields(String field1, String field2) {
        // Assert the response body contains specified fields
        String responseBody = response.getBody().asString();
        assert(responseBody.contains(field1));
        assert(responseBody.contains(field2));
    }
}
