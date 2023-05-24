Feature: Test Feature file

  Scenario: Opening and CLosing the Chrome browser
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    And the user closes the browser


  Scenario: The user logs in Successfully
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    When the user enters "standard_user" and "secret_sauce"
    Then the user should be able to login
    And the 'Sauce Labs' logo is displayed
    Then the user closes the browser
    
  Scenario: Add products to the cart
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    When the user enters "standard_user" and "secret_sauce"
    Then the user should be able to login
    And the 'Sauce Labs' logo is displayed
    When the user clicks on 'Add Product button'
    Then the user closes the browser

  Scenario: Purchase the products and checkout
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    When the user enters "standard_user" and "secret_sauce"
    Then the user should be able to login
    When the user clicks on 'Add Product button'
    Then the user click on cart logo