@password_edition
Feature: password_edition


  @password_lowercase
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send "<newPassword>" with one lowercase
    Then verify the level chart change accordingly
    And close the Page

    Examples: test_data

      |username      |     password      |      newPassword    |
      |betygnc       |     1618btyG.     |      222222b        |


  @password_uppercase
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send "<newPassword>" with one uppercase
    Then verify the level chart change accordingly
    And close the Page

    Examples: test_data

      |username      |     password      |      newPassword    |
      |betygnc       |     1618btyG.     |      222222B         |



  @password_digit
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send "<newPassword>" with one digit
    Then verify the level chart change accordingly
    And close the Page

    Examples: test_data

      |username      |     password      |      newPassword    |
      |betygnc       |     1618btyG.     |      bbbbbb1         |


  @password_special_char
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send "<newPassword>" with one special char
    Then verify the level chart change accordingly
    And close the Page

    Examples: test_data

      |username      |     password      |      newPassword    |
      |betygnc       |     1618btyG.     |      bbbbbb?        |


  @password_sevenChars
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send "<newPassword>" with seven chars
    Then verify the level chart change strongest
    And close the Page

    Examples: test_data

      |username      |     password      |      newPassword    |
      |betygnc       |     1618btyG.     |      1618Bb!        |


  @password_old_password
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send  "<oldPassword>" as new Password
    Then send "<oldPassword>" to confirmation and click save button
    Then verify the error message
    And close the Page

    Examples: test_data

      |username      |     password      |      oldPassword    |
      |betygnc       |     1618btyG.     |      1618btyG.      |


  @password_confirmation
  Scenario Outline: US08_Password_Edition

    Given user opens the URL "https://www.medunna.com/"
    When user navigate to user icon
    When user click on Sign in button password page
    And user enters username as "<username>" and password as "<password>" and click on Sign in button
    And  navigate to userId
    And click  password button
    And send current "<password>"
    Then Send "<newPassword>"
    Then send "<newPassword>" to confirm and click save button
    Then verify the confirmation message
    And close the Page

    Examples: test_data

      |username      |     password      |      newPassword    |
      |betygnc       |     1618btyG.     |      1618btyG.        |


