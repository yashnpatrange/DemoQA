Feature: Test Feature file

  Scenario: Opening the Chrome browser
    Given the user opens the browser and lands on LogIn page
    When the user enters username and password
    Then the user should be able to login
    And the user closes the browser