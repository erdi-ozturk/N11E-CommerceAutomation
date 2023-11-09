Feature: Add Item My Favorite

  Background:
    Given Navigate to N HomePage
    When Click Login Button
    Then Verify Login Form
    And Enter valid User Information

  Scenario: Enter Samsung Text On Search Input And Verify Results
    When Click HomePage
    Then Send Samsung Data On Search Input
    And Click Search Button

  Scenario: Add A Samsung Item On My Fav
    Given Send Samsung Data in Search Input
     When User Should Click Heart Button On Third Item
     Then Click My Favorite Button On Page
     And User Should Display Item That Chosen One On My Favorites Page
     And Click Remove Item Button From My Favorites