@smoketest
Feature: US09_Patient_View_Edit_Test
  Background:
    Given User goes to url
    Then Verify the url title
    When Click the sign in link and sign in dropdown
    And Sign in as "staff"
    Then Verify account contains firstName and lastName of "staff"
    When Click My Pages button and Search Patient dropdown
    And Click ssn of patient and enter ssn number

    @smoketest
  @US09_TC01
  Scenario:US09_TC01_staff_click_view_button
    And Click view button for patient
    And Verify all patient information displayed
    When Click account and Click sign out dropdown
    Then Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page

  @smoketest
  @US09_TC02/1
  Scenario:US09_TC02_staff_edit_id
    And  Click edit button for patient
    Then Verify the page title contains -Create or edit a Patient- text
    When Enter a new value to id box
    And Click save button
    Then Verify -A patient is updated with identifier- alert
    When Click account and Click sign out dropdown
    Then Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page

  @smoketest
  @US09_TC02/2
  Scenario:US09_TC02_staff_edit_firstname_lastname_vs
    And  Click edit button for patient
    Then Verify the page title contains -Create or edit a Patient- text
    And Enter a new value to fistname box
    And Enter a new value to lastname box
    And Enter a new value to email box
    And Enter a new value to phone box
    And Enter a new value to gender box
    And Enter a new value to blood group box
    And Enter a new value to address box
    And Enter a new value to description box
    And Enter a new value to user box
    And Enter a new value to country box
    And Click save button
    Then Verify -A patient is updated with identifier- alert
    When Click account and Click sign out dropdown
    Then Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page

  @smoketest
   @US09_TC02/3
  Scenario:US09_TC02_staff_edit_state_city
    And  Click edit button for patient
    Then Verify the page title contains -Create or edit a Patient- text
    And Enter a new value to state-city box
    And Click save button
    Then Verify -A patient is updated with identifier- alert
    When Click account and Click sign out dropdown
    Then Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page

  @smoketest
  @US09_TC02/4
  Scenario:US09_TC02_staff_edit_birth_date
    And  Click edit button for patient
    Then Verify the page title contains -Create or edit a Patient- text
    And Enter a new value to birth date box
    And Take the screenshot
    And Click save button
    Then Verify -A patient is updated with identifier- alert
    When Click account and Click sign out dropdown
    Then Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page

  @smoketest
  @US09_TC03
  Scenario:US09_TC03_staff_see_all_patient_info_populated
    Then Verify all patient info populated.
    When Click account and Click sign out dropdown
    Then  Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page
