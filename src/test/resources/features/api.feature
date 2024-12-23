@Api
Feature: API testing with Cucumber and RestAssured

  Scenario: Verify status code for GET /users endpoint
    Given I send a GET request to "/users"
    Then the status code should be 200

  Scenario: Verify user details for a specific user
    Given I send a GET request to "/users/1"
    Then the response should contain "name" and "email"
    And the status code should be 200