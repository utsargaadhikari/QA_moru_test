Feature: Users Module Functionality

  Background:
    Given I am on the login page
    And I log in as "demoadmin" with password "demopass12"

  Scenario: Verify Successful User Login
    When I enter valid username and password
    And I click the "Login" button
    Then I should be redirected to the dashboard

  Scenario: Validate Incorrect Login Attempt
    When I enter invalid username or password
    And I click the "Login" button
    Then I should see an error message

  Scenario: Test User Registration
    When I navigate to the user registration page
    And I enter valid registration details
    And I click the "Register" button
    Then a new user account should be created

  Scenario: Test User Profile Update
    When I navigate to the user profile page
    And I modify user profile information
    And I click the "Save" button
    Then the user profile information should be updated