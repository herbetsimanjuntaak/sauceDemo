@login
Feature: Login


  @valid-login
  Scenario: Login with valid email and password
    Given user in login page
    And user input username "standard_user"
    And user input password "secret_sauce"
    When user click login button
    Then user redirect to homepage

  @invalid-login
  Scenario: Login with locked user
    Given user in login page
    And user input username "locked_out_user"
    And user input password "secret_sauce"
    When user click login button
    Then user will see notification error message "locked out"

  @invalid-login
  Scenario: Login with invalid email and password
    Given user in login page
    And user input username "locked_out_user"
    And user input password "secret_sauces"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @invalid-login
  Scenario: Login with invalid username and valid password
    Given user in login page
    And user input username "locked_out_userssss"
    And user input password "secret_sauces"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @invalid-login
  Scenario: Login with invalid password and valid username
    Given user in login page
    And user input username "locked_out_user"
    And user input password "secret_saucesssssss"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"