Feature: Username_Test
Background: Go to homepage
  Given Open the URL "https://medunna.com"
  Then Verify the page title contains MEDUNNA

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
    When Enter any any chars on the username
    Then Verify Your username is required. is not displayed