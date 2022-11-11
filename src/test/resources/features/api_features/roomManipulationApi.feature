@Api_Room
Feature: US29_Room_Manipulation_Api

  @US29_TC2_Api_Room_Reading
  Scenario:US29_TC1_Api_Room_Reading
    Given User sends a get request all rooms
    Then User validates room data

  @US29_TC1_Api_Room_Creation
  Scenario:US29_TC2_Api_Room_Creation
    Given User sends a post request for new room
    Then User validates the posted data

  @US29_TC3_Api_Room_Updating
    Scenario:US29_TC3_Api_Room_Updating
    Given User sends a put request for room
    Then User validates the updated room data

  @US29_TC4_Api_Room_Deletion
    Scenario: US29_TC4_Api_Room_Deleting
    Given User sends a delete request for room
    Then User validates deleted room not exist