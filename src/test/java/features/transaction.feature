@transaction
Feature: Transaction

#  apakah waktu given harus sudah ada di web yang dituju

  @valid-trans
  Scenario: user checkout items
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user click cart button
    When user click button checkout
    Then user redirect to checkout page

  @valid-trans
  Scenario: user cancel checkout items
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user redirect to checkout page
    When user click button cancel
    Then user will see list cart

  @valid-trans
  Scenario: user valid checkout items and redirect to checkout overview
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user input firstname "herbet"
    And user input lastname "simanjuntak"
    And user input postal code "234345"
    When user click button continue
    Then user redirect to checkout overview

  @valid-trans
  Scenario: user finish checkout and payment
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user input firstname "herbet"
    And user input lastname "simanjuntak"
    And user input postal code "234345"
    And user click button continue
    And user redirect to checkout overview
    And user click button finish
    And user redirect to complete chekcout
    When user click button back home
    Then user redirect to homepage



  @invalid-trans
  Scenario: user fill firstname,lastname,postal code with 1000 chart
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user input firstname "herbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbet"
    And user input lastname "herbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbet"
    And user input postal code "herbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbetherbet"
    When user click button continue
    Then user redirect to checkout overview

  @invalid-trans
  Scenario: user checkout with empty firstname
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user input firstname ""
    And user input lastname "simanjuntak"
    And user input postal code "234345"
    When user click button continue
    Then user able to see error message "Error: First Name is required"

  @invalid-trans
  Scenario: user checkout with empty Lastname
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user input firstname "herbet"
    And user input lastname ""
    And user input postal code "234345"
    When user click button continue
    Then user able to see error message "Error: Last Name is required"

  @invalid-trans
  Scenario: user checkout with empty Postal code
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    And user click login button
    And user add product to cart
    And user add product to cart
    And user add product to cart
    And user click cart button
    And user click button checkout
    And user input firstname "herbet"
    And user input lastname "Simanjuntak"
    And user input postal code ""
    When user click button continue
    Then user able to see error message "Error: Postal Code is required"
