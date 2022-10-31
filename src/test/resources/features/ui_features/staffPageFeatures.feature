Feature: Staff related features
  Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA
    When user navigates on the login page
    And user enters username and password  and click on login button
      |username|password|
      |team02_staff|merve_mahir|
    Then verify the login is successful
      |firstname|lastname|
      |Merve   |Mahir  |

