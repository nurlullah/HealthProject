@Room_Manipulation
Feature: US16_Room_Create_View_Edit_Delete_Test
  Background:
    Given User goes to url
    Then Verify the url title
    When Click the sign in link and sign in dropdown
    And Sign in as "admin"
    Then Verify account contains firstName and lastName of "admin"
    When Click on ItemsTitles
    And Click on Room button

  @US16_TC1_Room_Create
  Scenario: US16_TC1_Room_Create
    When Click Create a new room button
    Then Verify that Create or edit a Room is displayed
    When Enter room number
    And Clear room number
    Then Verify This field is required.
    When Enter room number
    Then Verify all Room Types are selectable.
    When Click on Status checkbox
    Then Verify that checkbox is selected
    When Send price to price box
    And clear the price
    Then Verify This field is required.
    When Send price to price box
    And Send description to the description box
    And clear the description
    And user clicks on save button on room creation page
    Then Verify -A new Room is created- alert


  @US16_TC2_Room_Create_Past_Date
    Scenario: US16_TC2_Room_Create_Past_Date
    When Click Create a new room button
    Then Verify that Create or edit a Room is displayed
    When Enter room number
    And Send price to price box
    When send a past date to the date box
    And user clicks on save button on room creation page
    Then Verify created date is not the past date.

  @US16_TC3_Room_Create_Future_Date
  Scenario: US16_TC3_Room_Create_Future_Date
    When Click Create a new room button
    Then Verify that Create or edit a Room is displayed
    When Enter room number
    And Send price to price box
    When send a future date to the date box
    And user clicks on save button on room creation page
    Then Verify created date is not the future date.

  @US16_TC4_Room_View
  Scenario: US16_TC4_Room_View
    And Click on View button on Rooms page
    Then Verify that you can view all items.

  @US16_TC5_Room_Edit
  Scenario: US16_TC5_Room_Edit
    When Click on Edit button
    And Change the room number
    And user clicks on save button on room creation page
    Then Verify -A Room is updated- alert

  @US16_TC6_Room_Delete
  Scenario: US16_TC6_Room_Delete
    When Create a new room
    When Navigate to the last page
    And Click on last Delete button
    And Click on Delete as confirm on the alert
    Then Verify -A Room is deleted- alert