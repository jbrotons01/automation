Feature: Check the correct behavior of the login features in the Ecommerce

  Scenario: Login with invalid or non registered credentials
    Given the user wants to access to the ecommerce
    When the user fill the login mandatory field: nexoqa1@gmail.com and password123
    Then the ecommerce should be show a error feedback

