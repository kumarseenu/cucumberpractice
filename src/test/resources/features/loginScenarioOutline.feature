Feature: Login functionality
  @Sanity
  Scenario Outline: User logs in with valid credentials
    Given the user is on the login page
    When the user enters a valid "<username>" and "<password>"
    And the user clicks on submit button
    Then the user should be logged in successfully
    Examples:
      | username | password     |
      | student  | Password123  |
  @Regression
  Scenario Outline: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters a valid "<username>" and "<password>"
    And the user clicks on submit button
    Then the user should see an error message
    Examples:
      | username | password     |
      | student  | Password124  |