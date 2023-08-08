Feature: User Roles Functionality

  Background:
    Given I am logged in as "demoadmin"

  Scenario: Test Creation of New User Roles
    When I create a new role with specific permissions
    Then a new user role should be created
