@US023-01 @localtest
Feature: US023 Payment Invoice By Staff

   Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA
    When user navigates on the login page

  Scenario:
    When user patient enters username and click on login button
    Then user patient click on the My Pages from dropdown
    And user clicks on the make an appointment icon
    And user clicks on send an appointment button

  @US023-02
  Scenario: US023-TC002 User Staff approves the created appointment
    And user signs in as Staff
    Then user staff clicks on MYPAGE dropdown
    And user staff clikcs on Search Patient button
    Then user staff enters patients SSN box "patientSsnBoxValue"
    And user staff clicks on show appointments button
    And user staff clicks on edit button for cretaed appointment
    And user staff selects pending for appointment status
    And user staff assigns the doctor for the patient as "team02_physician_data"
    And user staff cliks on save button

  @US023-03
  Scenario: US023-TC003 User physician completes the process for the assigned appointment
   When user physician signs in as physician
   Then user physician clicks on MyPages dropdown button
   And  user physician selects My Appointments from dropdown
  And user physician clicks on edit button for the assigned appointment
  Then user physician clicks on Request A Test button
  And user physician selects cccs, Sodium and Urea tests
  And user physician clicks on save button on test list section
  Then user physician selects completed option from status dropdown
  And user physician selects anamneis, treatment, diagnosis checkboxes
  And user physician clicks on save button in the Create or Edit an Appointment section

  @US023-04
 Scenario: US023-TC004 user signs in as Staff to prepare invoice
    And user signs in as Staff
    Then user staff clicks on MYPAGE dropdown
    And user staff clikcs on Search Patient button
    Then user staff enters patients SSN box "patientSsnBoxValue"
    And user staff clicks on show appointments button
  And user staff clicks on payment/invoice process button for the patient
  And user staff clicks on create invoice button
  And user Staff clicks on save button on create or edit payment button
  And user staff enters patients SSN box {string}
  And user staff clicks on show appointments button
  And user staff clicks on payment button for the patient
  And user staff clicks on show invoice button
  Then user staff verifies that invoice is created
