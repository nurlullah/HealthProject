Feature: Registration related features
  Background:
    Given user goes to URL "https://www.medunna.com/"
    Then verify the page title contains "MEDUNNA"

  @US02_Username_Test
  Scenario: US02_Username_Test
    Given Click on the sign in and account icon
    When Click on Register Button
    Then Verify Registration text
    When Click on the SSN box
    And Enter SSN number
    And Click on the First Name box
    And Enter First Name
    And Click on the  Last Name box
    And Enter Last Name
    And Click on the username box and click  Enter
    Then Verify Your username is required.
    When Enter any chars on the username
    Then Verify Your username is required. is not displayed
