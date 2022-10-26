
Feature: US06_User_Settings_Test
  @UserSettings
  Scenario Outline: US06_User_Settings_Test
    Given User goes to url
    Then Verify the url title
    When Click the sign in link and sign in dropdown
    And Sign in as "<account>"
    Then Verify account contains firstName and lastName of "<account>"
    When Click account button and settings dropdown
    Then Verify page url is "https://www.medunna.com/account/settings"
    And Verify if firstNameBox is not empty
    And Verify if lastNameBox is not empty
    And Verify if emailBox is not empty
    When Send a new firstname to the firstname box and click save button
    Then Verify save alert
    And Send a new lastname to the lastname box and click save button
    Then Verify save alert
    When Click account and Click sign out dropdown
    Then Verify -THANK YOU FOR CHOOSING US...- text
    Then Close page

    Examples:
      |account  |
      |admin    |
      |physician|
      |patient  |
      |staff    |
      |user     |

  @fix
  Scenario Outline: fixing_user_info
    Given sign in as "<account>" fix firstname and lastname
    Examples:
      |account|
      |admin    |
      |physician|
      |patient  |
      |staff    |
      |user     |