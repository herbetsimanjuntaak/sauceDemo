@Home
Feature: Home page

#  sorting product by
#  Name (A to Z)
#  Price (high to low)
#  Name (Z to A)
#  Price (low to high)

  @valid-home
  Scenario: Test login web sorting product by Price (high to low)
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user redirect to homepage
    And user click option sorting
    When user click field "Price (low to high)"
    Then user redirect to homepage


  @valid-home
  Scenario: user login web and add product to cart
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user redirect to homepage
    When user add product to cart
    When user add product to cart
    When user add product to cart
    When user add product to cart
    When user add product to cart
    When user add product to cart
    Then verify cart item is match "6"

  @valid-home
  Scenario: user login web and remove product added
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user redirect to homepage
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user add product to cart
    When user remove product
    Then verify cart item is match "5"

  @valid-home
  Scenario: user see detail product and add to cart
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user redirect to homepage
    And user click Red image product
    And user will see detail product
    When user add product to cart
    Then verify cart item is match "1"

