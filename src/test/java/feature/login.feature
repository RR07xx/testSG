Feature: Login Feature
  This feature tests the login functionality of the application

  Scenario: Verify the login of the application
    Given I navigate to the home page
    When I click on login and enter credentials
    Then I should see the login page and close