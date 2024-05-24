Feature: Cart Feature
  This feature is used to add items into the cart and checkout

  Scenario: Verify the cart by adding an item to the cart and checking out
    Given I login to the application and navigate to the home page
    When I add an item to the cart and click on add to cart
    Then I should see the item in my cart
    And I should proceed to check out