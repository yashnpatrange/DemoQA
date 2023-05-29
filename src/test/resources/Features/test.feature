Feature: Product Purchase

  Scenario: Opening and CLosing the Chrome browser
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    And the user closes the browser

  @login
  Scenario Outline: The user logs in Successfully
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    When the user enters "<username>" and "<password>"
    Then the user should be able to login
    And the 'Sauce Labs' logo is displayed
    Then the user closes the browser
    Examples:
      |  username     | password    |
      | standard_user |secret_sauce |
      | problem_user  |secret_sauce |
      | standard_user |secret_sauce |


  @logout
  Scenario: The user logs out Successfully
    Given the user opens the browser and navigates to the homepage "https://www.saucedemo.com/"
    When the user enters "standard_user" and "secret_sauce"
    Then the user should be able to login
    And the user clicks on 'open menu' icon
    When the user click on 'Logout' link
    Then the user closes the browser

  @smoke
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
    And the user clicks on 'Checkout' button
    When the user enters firstname "John"  ,lastname "Wick" and zipcode "L5A4C6"
    And the user click on 'Finish' button
    Then final message is displayed