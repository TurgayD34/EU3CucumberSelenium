Feature: Account Types

  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calender Events"
    Then the title contains "Calender Events - Activities"

  Scenario: Sales Manager user
    Given the user logged in as "sales manager"
    When the user navigates to "Customers" "Accounts"
    Then the title contains "Accounts - Customers"

  Scenario: Store Manager user
    Given the user logged in as "store manager"
    When the user navigates to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"

#  Scenario: Driver user
#    Given the user logged in as "driver"
#
#  Scenario: Sales Manager user
#    Given the user logged in as "sales manager"
#
#  Scenario: Store Manager user
#    Given the user logged in as "store manager"
#
#  Scenario: Admin user
#    Given the user logged in as "admin"
#
#    @wip
#  Scenario Outline: Different user types
#    Given the user logged in as "<userTypes>"
#    Examples:
#      | userTypes     |
#      | driver        |
#      | sales manager |
#      | store manager |
#      | admin         |
  @wip
  Scenario Outline: Login with different accounts
    Given the user logged in as "<userTypes>"
    When the user navigates to "<tabs>" "<modules>"
    Then the title contains "<titles>"

    Examples:
      | userTypes     | tabs       | modules         | titles                       |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |

#  Scenario Outline: Login with different accounts
#    Given the user logged in as "<userType>"
#    When the user navigates to "<tab>" "<module>"
#    Then the title contains "<title>"
#
#    Examples:
#      | userType      | tab        | module          | title                                                            |
#      | driver        | Fleet      | Vehicle Model   | Vehicle Model - Entities - System - Car - Entities - System      |
#      | driver        | Customers  | Accounts        | Accounts - Customers                                             |
#      | driver        | Customers  | Contacts        | Contacts - Customers                                             |
#      | driver        | Activities | Calendar Events | Calendar Events - Activities                                     |
#      | driver        | System     | Calendar Events | Jobs - System                                                    |
#      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - System - Car - Entities - System |