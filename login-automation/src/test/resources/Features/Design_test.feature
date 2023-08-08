Feature: Design and Usability

  Background:
    Given I am logged in as "demoadmin"

  Scenario: Verify Consistency in Design Elements
    When I review various pages for design consistency
    Then design elements should appear uniform

  Scenario: Test Responsiveness
    When I access the application on different devices
    Then the application should display properly on all screen sizes
