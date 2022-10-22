Feature: Medunna_Test

  @US16_Room_Manipulation
  Scenario: US16_Room_Manipulation
    Given User goes to URL "https://www.medunna.com"
    Then verify the page title contains "MEDUNNA"
    Then capture the screenshot

