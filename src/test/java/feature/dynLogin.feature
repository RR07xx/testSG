Feature: Login Feature
  This feature tests the login functionality of the application

  Scenario Outline: Verify the login of the application
    Given I navigate to the home page
    When I click on login and enter the <Username> and <Password>
    Then I should see the login page
    And I should close the browser

    Examples:
      | Username        | Password |
      | testex@mail.com | Test1234 |
      | testex@mail.com | test1234 |