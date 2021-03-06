@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page
#    If all scenarios begin same steps we can use Background, but if one of them is different scenario it will be fail

  @driver
  Scenario: Login as a driver
#    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login

@sales_manager
  Scenario: Login as a sales manager
#    Given the user is on the login page
    When the user enters the sales information
    Then the user should be able to login

@store_manager @smoke
  Scenario: Login as store manager
#    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login