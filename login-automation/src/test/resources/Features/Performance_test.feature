Feature: Performance Testing

  Background:
    Given I am logged in as "demoadmin"

  Scenario: Test Response Times
    When I perform various actions
    Then the application should respond within an acceptable time frame
