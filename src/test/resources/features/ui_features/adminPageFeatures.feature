Feature: Admin features

  Background:
    Given user goes to URL "https://www.medunna.com/"
    Then verify the page title contains "MEDUNNA"
    When user navigates on the login page
    And user enters username and password  and click on login button
      |username|password|
      |team02_admin|egemen_parlak|
    Then verify the login is successful
      |firstname|lastname|
      |Egemen   |Parlak  |

  @us15_tc01
  Scenario: TC01_New_patient_can_only_be_created_by_admin

    When user navigates to patients page
    And click on create new patient
    And user enters the firstname
    And user enters the lastname
    And user enters the birthdate
    And user enters the email
    And user enters the phone number
    And user select a gender
    And user select a blood group
    And user enters the address
    And user enters the description
    And user select a user
    And user select a country
    And user select a state
    When user clicks on save button
    Then verify A new patient is created pop up


