  @navigation
  Feature: Navigation pages

    Scenario: fleet -> vehicles
      Given the user is on the login page
      When the user is on the fleet page
      When the user navigate fleet to vehicles
      Then expected title is vehicles

    Scenario: marketing -> campaigns
      Given the user is on the login page
      When the user is on the marketing page
      When the user navigate marketing to campaigns
      Then expected title is campaigns

    Scenario: activities -> calender events
      Given the user is on the login page
      When the user is on the activities page
      When the user navigate activities to calender events
      Then expected title is calender events