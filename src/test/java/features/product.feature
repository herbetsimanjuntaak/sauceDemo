@product
  Feature: Product

    @valid-product
    Scenario: user login web and see detail product Sauce Labs Backpack
      Given user in login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user redirect to homepage
      When user click image Backpack product
      Then user will see detail product

    @valid-product
    Scenario: user login web and see detail product Sauce Labs Bike Light
      Given user in login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user redirect to homepage
      When user click Bike image product
      Then user will see detail product

    @valid-product
    Scenario: user login web and see detail product Sauce Labs Bolt T-Shirt
      Given user in login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user redirect to homepage
      When user click Bolt image product
      Then user will see detail product

    @valid-product
    Scenario: user login web and see detail product Sauce Labs Fleece Jacket
      Given user in login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user redirect to homepage
      When user click Fleece image product
      Then user will see detail product

    @valid-product
    Scenario: user login web and see detail product Sauce Labs Onesie
      Given user in login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user redirect to homepage
      When user click Onesie image product
      Then user will see detail product

    @valid-product
    Scenario: user login web and see detail product Test.allTheThings() T-Shirt (Red)
      Given user in login page
      And user input username "standard_user"
      And user input password "secret_sauce"
      And user click login button
      And user redirect to homepage
      When user click Red image product
      Then user will see detail product

