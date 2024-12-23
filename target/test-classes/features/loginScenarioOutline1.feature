#Feature: Login functionality
#
#  Scenario Outline: User logs in with valid credentials
#    Given the user is on the login page
#    When the user enters a valid "<username>" and "<password>"
#    And the user clicks on submit button
#    Then the user should see "<result>"
#    Examples:
#      | username | password     | result                 |
#      | student  | Password123  | logged-in-successfully |
#      | student  | Password124  | practice-test-login    |
