Feature: Login With Valid User
  @SmokeTest
  Scenario: Login
    Given Navigate to N HomePage
    When Click Login Button
    Then Verify Login Form
    And Enter valid User Information
    And Verify User Login
