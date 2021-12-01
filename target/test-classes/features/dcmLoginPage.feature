Feature: Login
  As a user of DCM application,I want to be able to test all the scenarios of login

  Scenario: Check Login with valid Email address and Password
    Given User launches application
    Then User clicks on Login button
    When User enters Email address and Password
    Then User clicks on the Continue button
    And User should see the Dashboard displayed



