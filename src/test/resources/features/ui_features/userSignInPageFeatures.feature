@us_04
Feature: Login_page_valid_credentials

  @user_login_happy_scenario ##pass
  Scenario Outline: User_story_04_001_01
    Given user opens the url "https://www.medunna.com/"
    When click the sign in symbol and sign in button
    And enter the valid username as "<username>"
    And enter the valid password as "<password>"
    And user click the sign in button
    Then verify the sign in successfully
    And click the sign out button
    Then verify the sign out successfully
    And close the application

    Examples:
      |username|  |password|
      |team02_user||fatih_sakin|


  @user_login_negative_scenario ##pass
  Scenario Outline: User_story_04_001_02
    Given user opens the url "https://www.medunna.com/"
    When click the sign in symbol and sign in button
    And enter the invalid username as "<username>"
    And enter the invalid password as "<password>"
    And user click the sign in button
    Then verify the unsuccessful test case
    And close the application

    Examples:
      |username  ||password|
      |damla     ||gencer  |
      |dmlgencer ||damla12345|

  @remember_me_check_box ##pass
  Scenario: User_story_04_002
    Given user opens the url "https://www.medunna.com/"
    When click the sign in symbol and sign in button
    Then verify the remember me option is enabled
    And close the application


  @did_you_forget_text ##pass
  Scenario: User_story_04_003
    Given user opens the url "https://www.medunna.com/"
    When click the sign in symbol and sign in button
    Then verify the "Did you forget your password?" button is enabled and clickable
    And click the forget password button
    Then verify the forget password page
    And close the application


  @registration_page ##pass
  Scenario: User_story_04_004
    Given user opens the url "https://www.medunna.com/"
    When click the sign in symbol and sign in button
    Then verify the registration button is enabled and clickable
    And click the registration button
    Then verify the registration page
    And close the application


  @cancel_button ##pass
  Scenario: User_story_04_005
    Given user opens the url "https://www.medunna.com/"
    When click the sign in symbol and sign in button
    Then verify the cancel button is enabled
    And close the application
