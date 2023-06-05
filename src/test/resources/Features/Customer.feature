Feature: Customer Login
  Scenario: Add a new customer
    Given User launch the browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters email "admin@yourstore.com" and password "admin"
    And user clicks on login
    Then user can view the dashboard
    And from the customers tab user selects customers item
    And user clicks on 'Add new' button
    When user enters the info
    And user clicks on save button
    Then user can see the message- "The new customer has been added successfully"
    And closes the browser