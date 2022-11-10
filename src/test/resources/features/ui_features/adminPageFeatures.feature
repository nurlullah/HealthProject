Feature: Admin features

  Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA
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


  Scenario: TC02_Admin_can_see_all_patient_information
    When user navigates to patients page


  @us18_part02_tc_01
   Scenario Outline: TC01_Admin_can_view_all_Physicians_info

    When admin click items&titles button
    And Click Physician button
    And Click view button for physicians "<id>"
    And Verify that admin can view Physicians' info
    Then Close the page Physicians info page
    Examples:
      | id |
      | 3651 |

  @us18_part02_tc_02
  Scenario Outline: TC01_Admin_can_edit_all_Physicians_info

    When admin click items&titles button
    And Click Physician button
    And Click edit button for physicians "<id>"
    And Admin edits physicians some info
    And Verify that admin can edit Physicians' info
    Then Close the page Physicians info page
    Examples:
      | id |
      | 3651 |

  @us18_part02_tc_03
  Scenario Outline: TC01_Admin_can_delete_existing_Physicians

    When navigate to Administration button
    And click on User Management
  #  And Click delete button for  "<page>" physicians "<id>"
  #  And Verify that admin can delete Physicians' info
    Then Close the page Physicians info page
    Examples:
   |page|  id |
   | 41 | 291541|
   | 42 | 291542|




