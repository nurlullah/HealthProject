Feature: HomePage related features
  Background:
    Given user goes to URL "https://www.medunna.com/"
    Then verify the page title contains "MEDUNNA"

    And user click on the make an appointment icon



  @us05_TC01
  Scenario: TC01 User_needs_to_type_in_their_name_containing_any_chars_and_it_cannot_be_blank

    When user click on the first name box
    And user click Enter button
    Then verify Your FirstName is required is displayed
    And user type the first name that contains any chars
    Then verify that "Your FirstName is required" is not displayed
    And user close the connection

  @us05_TC02
  Scenario: TC02 User_provides_their_matching_SSN_id_(same as registered SSN)_and_it_cannot_be_blank
    When user click on the SSN box
    And user type the "SSN ID" that has "-" after 3rd and 5th digits, it should be 9 digits long and can not be blank
    Then verify that "Your SSN is invalid." is not displayed
    And user close the connection

  @us05_TC03
  Scenario: TC03 User_provides_their_lastname_containing_any_chars_and_it_cannot_be_blank
    When user click on the last name box
    And Click Enter button
    Then verify "Your LastName is required" is displayed
    And user type the "last name" that contains any chars
    Then verify that "Your FirstName is required" is not displayed
    And user close the connection

  @us05_TC04
  Scenario:TC04 user_provides_email_id
    When user click on the email box
    And user type invalid any emails
    Then verify "This field is invalid"
    And user type valid any email
    Then verify "This field is invalid"is not displayed
    And clear Email box
    And user type valid any email
    Then verify "Your email is required." is not displayed
    And user close the connection

  @us05_TC05
  Scenario: TC05 User_provides_a_valid_10_digit_phone_number_'-'_after_3th_and_6th_digits_and_it_cannot_be_blank
    When user click on the Phone box
    Then verify that "Phone number is required." is displayed
    And user type invalid Phone number
    Then verify that Your SSN is invalid is displayed
    And user click valid Phone number that contains '-' after 3th and 6th digits and can not be blank
    And user close the connection

  @us05_TC06
  Scenario Outline: TC06 When_user_makes_an_appointment_and_registers_they_can_see_their_profiles_and_sign_in_the_app
    When user click on the sign in and register icon
    And user click on Sign in button
    And user click on the Username box
    And user type the Username
    And user click on the Password box
    And user type the "<Password>"
    And user click on the Sign In button
    And user click on the My Pages/Patients icon
    And user click on the My Appointments icon
    And user click on the from box
    And user type a date earlier than appointment date
    And user click on the to box
    And user type a date later than appointment date
    Then Verify the "Days between begin date and end date must be max 15 days" pop-up is displayed
    And user click on the from box
    And user type a date earlier than appointment date
    And user click on the from box
    And user type a date later than appointment date
    And hover over the name
    And user click on the name