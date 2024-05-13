@Cart
Feature: Cart

  @valid-cart
  Scenario: user will see product added to cart
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    When user click cart button
    Then verify cart item is match "2"


  @valid-cart
  Scenario: user continue shopping while in the cart
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user will see list cart
    When user click button continue shopping
    And user add product to cart
    And user add product to cart
    And user click cart button
    Then verify cart item is match "4"


  @valid-cart
  Scenario: user remove items in cart
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user click cart button
    When user remove product
    Then verify cart item is match "1"