Feature: DropDown Menu Actions With Hover

  Background:
    Given Navigate to N HomePage
    When Click Login Button
    Then Verify Login Form
    And Enter valid User Information
    And Verify User Login

  Scenario: DropDown Menu Actions With Hover
    Given Hover Electronics On Menu
    Then Click Computer Link That Opened Menu

