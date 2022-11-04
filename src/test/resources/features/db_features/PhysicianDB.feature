Feature: id verification

  @db_verification_physician

  Scenario: Validate physicians info with DB

    Given user connects to the application database
    Then get physicians id from table
    And user verifies id as 3651
    Then user close the connection



