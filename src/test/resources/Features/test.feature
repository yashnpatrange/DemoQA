Feature: Test Feature file

  Scenario: Opening the Chrome browser
    Given the user opens the browser and lands on "https://www.saucedemo.com/"
    When the user enters "standard_user" and "secret_sauce"
    Then the user should be able to login
    And the user closes the browser