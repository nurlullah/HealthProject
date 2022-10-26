Feature: HomePage related features
  Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA

  @us05_TC01
  Scenario: TC01 User_needs_to_type_in_their_name_containing_any_chars_and_it_cannot_be_blank
    And user click on the make an appointment icon
    Then user clicks on enter button on firstname box on homepage
    Then verify Your FirstName is required is displayed
    Then user types the firstname on homepage appointment



  @us05_TC02
  Scenario: TC02 User_provides_their_matching_SSN_id_(same as registered SSN)_and_it_cannot_be_blank
    And user clicks on enter button on ssn box on homepage
    Then verify that Your SSN is required alert is displayed
    And user types an invalid SSN
    Then  verify your SSN is invalid alert is displayed
    And user types valid SSN on homepage appointment.


  @us05_TC03
  Scenario: TC03 User_provides_their_lastname_containing_any_chars_and_it_cannot_be_blank
    And user click on the make an appointment icon
    Then user clicks on enter button on lastname box on homepage
    Then verify Your LastName is required is displayedName is required is displayed
    Then user types the lastname on homepage appointment

  @us05_TC04
  Scenario:TC04 user_provides_email_id
    And user clicks on enter button on email box on homepage
    Then verify that Your email is required alert is displayed
    And user types an invalid email
    Then  verify this field is invalid alert is displayed
    And user types valid email on homepage appointment.


  @us05_TC05
  Scenario: TC05 User_provides_a_valid_10_digit_phone_number_'-'_after_3th_and_6th_digits_and_it_cannot_be_blank
    And user clicks on enter button on phone box on homepage
    Then verify that Your phone is required alert is displayed
    And user types an invalid phone
    Then  verify your phone is invalid alert is displayed
    And user types valid phone on homepage appointment.

  @us07_TC01_01 @smoke_test
  Scenario: TC01 User_needs_a_valid_date
    And user click on the make an appointment icon
    And user types the firstname on homepage appointment
    And user types the lastname on homepage appointment
    And user types valid SSN on homepage appointment.
    And user types valid email on homepage appointment.
    And user types valid phone on homepage appointment.
    When Click on the Appointment Date Time slot and enter current and future valid date and then Appointment date can not be past date! should be wiped out
    And Click on the Send an Appointment Request button
    Then Verify the Appointment registration saved. We will call you as soon as possible alert

  @us07_TC01_02 @smoke_test
  Scenario: TC02 User_needs_an_old_date
    And user click on the make an appointment icon
    And user types the firstname on homepage appointment
    And user types the lastname on homepage appointment
    And user types valid SSN on homepage appointment.
    And user types valid email on homepage appointment.
    And user types valid phone on homepage appointment.
    When user enters old date
    Then verify appointment date can not be past date message
    Then verify that send appointment request button is unclickable

  @us07_TC01_03 @smoke_test
  Scenario: TC03 User_needs_an_appointment_for_today_and_do_not_change_current_date
    And user click on the make an appointment icon
    And user types the firstname on homepage appointment
    And user types the lastname on homepage appointment
    And user types valid SSN on homepage appointment.
    And user types valid email on homepage appointment.
    And user types valid phone on homepage appointment.
    And Click on the Send an Appointment Request button
    Then Verify the Appointment registration saved. We will call you as soon as possible alert

  @us07_TC01_04 @smoke_test
  Scenario: TC04 User_needs_an_appointment_for_today_and_enter_current_date
    And user click on the make an appointment icon
    And user types the firstname on homepage appointment
    And user types the lastname on homepage appointment
    And user types valid SSN on homepage appointment.
    And user types valid email on homepage appointment.
    And user types valid phone on homepage appointment.
    And user  types current date on home page appointment
    And Click on the Send an Appointment Request button
    Then Verify the Appointment registration saved. We will call you as soon as possible alert

  @us07_TC02_01 @smoke_test
  Scenario: US07_Appointment_Date_Test

    When Click on the Appointment Date Time slot and enter current and future valid date and then Appointment date can not be past date! should be wiped out
    Then Verify calender format is day mm year

