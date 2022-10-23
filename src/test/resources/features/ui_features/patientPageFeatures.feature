Feature: Patient related features

  Background:
    Given user goes to URL "https://www.medunna.com/"
    Then verify the page title contains "MEDUNNA"
    When user navigates on the login page
    And user enters username and password  and click on login button
      |username|password|
      |team02_patient|deniz_zengin|
    Then verify the login is successful
      |firstname|lastname|
      |Deniz   |Zengin  |


