Feature: Add Item To Cart

  Background:
    Given Navigate to N HomePage
    When Click Login Button
    Then Verify Login Form
    And Enter valid User Information
    And Verify User Login

  Scenario: Add Item To Cart And Verify That Item
    Given Hover Electronics On Menu
    Then Click Computer Link That Opened Menu
    And Click Go To Cart Alert (Pop up)
    And Verify That Chosen Item