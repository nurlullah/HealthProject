@appointment_api
Feature: appointment related features

  @userApi
  Scenario: user api data request
    Given user sends a get request for users
    And user converts user records to Java
    Then user validates user data

# Feature: appointment api feature

#  @us07_TC03_01
#
##    @AppointmentPostRequest
#  Scenario: US07_fetch_appointment_using_api
#
#    Given user sends a post request for appointment
#    Then user validates post data
#
#    #     @appointmentGetRequest
#  Scenario: US07_create_appointment_using_api
#
#    Given user sends a get request for appointment
#    And user converts json data to java
#    Then user validates the appointment data