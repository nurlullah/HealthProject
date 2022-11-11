@DB_Room
Feature: US29_Room_Manipulation_DB

  @US29_TC1_Api_Room_Reading
  Scenario: US29_TC1_DB_Room_Reading
    Given user connects to the application database
    When verify table "room" and column "description" contains data "it is db testing 11.11.2022"
    Then user close the connection


