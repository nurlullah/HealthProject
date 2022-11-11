@registrant_api
Feature: Registration api related features
@username_api_test
  Scenario:Username_validates_api
    Given user sends a get request for registration data
    And user converts JSon data to java
    And user validates username by api usernames should be unique
@email_api_test
Scenario Outline: Email_validates_api
  Given user sends a get request for registration data
  And user converts JSon data to java
  And user validates "<email>" by api
  Examples:
    | email |
    |wava.terry@gmail.com|

