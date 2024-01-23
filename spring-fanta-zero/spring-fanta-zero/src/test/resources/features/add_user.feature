Feature: Add user

  Scenario: Admin adds a new user
    Given Admin has user details with name "John Doe" and email "john@example.com"
    When Admin adds the user
    Then the user should be added successfully
