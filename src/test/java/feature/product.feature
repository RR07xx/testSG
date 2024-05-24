Feature: Product Feature
  To check the product page of the application and sign out

  Scenario: Verify the product page and sign out
    Given I login to the application and navigate to the home
    When I click on products
    Then I should see the products page
    Then I click on logout
    And I close the browser