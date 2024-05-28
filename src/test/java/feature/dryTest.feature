Feature: Logout Feature
  To check if the software allows the user to logout after logging in.

  Scenario: Verify the logout feature of the application
    Given I navigate to the home page and login
    When I click on logout button
    Then I should see the login page again