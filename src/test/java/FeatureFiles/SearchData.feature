Feature: Search Data
  Background:
    Given Navigate to N HomePage
    When Click Login Button
    Then Verify Login Form
    And Enter valid User Information
    And Verify User Login
  Scenario: Enter Samsung Text On Search Input And Verify Results
    Given Click HomePage
    When Send Samsung Data On Search Input
    Then Click Search Button
    And Verify Results
