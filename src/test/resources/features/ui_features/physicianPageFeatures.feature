Feature: Physician related features
  Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA
    When user navigates on the login page
    And user enters username and password  and click on login button
      |username|password|
      |team02_physician|bilge_dede|
    Then verify the login is successful
      |firstname|lastname|
      |Bilge   |Dede  |

  @smoketest
  @us05_TC06
  Scenario: TC06 When_user_makes_an_appointment_and_registers_they_can_see_their_profiles_and_sign_in_the_app

    And user click on the My Pages Patients icon
    And user click on the My Appointments icon
    And user click on the from box
    And user type a date earlier than appointment date
    And user click on the to box
    And user type a date later than appointment date
    Then verify the Days between begin date and end date must be max 15 days pop-up is displayed
    And user click on the from box
    And user type a date earlier than appointment date
    And user click on the from box
    And user type a date later than appointment date
    #And hover over the name
    #And user click on the name







