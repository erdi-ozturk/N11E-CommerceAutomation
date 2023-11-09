Feature: Login With Scenario Outline Method

  Background:
    Given Navigate to N HomePage

  Scenario Outline: Login Functionality
    When Click Login Button
    And Enter valid User Informations
      | loginEmail    | <userName> |
      | loginPassword | <password> |
    Examples:
      | userName                | password   |
      | li]k****i.******@gmail.com | _08we******07 |