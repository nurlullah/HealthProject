@us_03
Feature: US03_Registration_page_strength_password

  Background: user_goes_to_medunna_registration_page
    Given User goes to the medunna url
    When User clicks the sign in symbol and register dropdown button
    Then User enters ssn "ssn"
    And User enters firstname "firstName"
    And User enters lastname "lastName"
    And User enters username "login"
    And User enters email "email"


  @us03_tc01
  Scenario Outline: US03_TC01
    Given User enters four chars password "<password>"
    Then User verifies password chart red color is "1"
    And User enters the confirm "<confirmPassword>"
    And User clicks the register button
    Then verify the Registration Saved text
    And User closes the application
    Examples:
      | password |confirmPassword|
      | xyzt     |   xyzt        |
      | XYZT     |   XYZT        |
      | 1234     |   1234        |
      | @*%$     |   @*%$        |
      | Xy1*     |   Xy1*        |

  @us03_tc02
  Scenario Outline: US03_TC02
    Given user enters seven chars that possibilities with two combination "<password>"
    Then User verifies password chart orange color is "2"
    And User enters the confirm "<confirmPassword>"
    And User clicks the register button
    And User closes the application
    Examples:
      | password |confirmPassword|
      | xyzXYZT  |   xyzXYZT     |
      | 1234xyz  |   1234xyz     |
      | 1234%$*  |   1234%$*     |
      | xyzt123  |   xyzt123     |
      | XYZT%+*  |   XYZT%+*     |
      | xyzt%+*  |   xyzt%+*     |
      | %+*xyzt  |   %+*xyzt     |

  @us03_tc03
  Scenario Outline: US03_TC03
    Given user enters seven chars that possibilities with three combinations "<password>"
    Then User verifies password with four chart green color is "3"
    And User enters the confirm "<confirmPassword>"
    And User clicks the register button
    And User closes the application
    Examples:
      | password |confirmPassword|
      | ABxy123  |   ABxy123     |
      | %&123XY  |    %&123XY    |
      | 123xy*&  |    123xy*&    |

  @us03_tc04
  Scenario Outline: US03_TC04
    Given User enters seven chars that possibilities with four combinations "<password>"
    Then User verifies password with four chart green color with five bar is "4"
    And User enters the confirm "<confirmPassword>"
    And User clicks the register button
    And User closes the application
    Examples:
      | password |confirmPassword|
      | XYzt12%  |    XYzt12%    |
      | %XYzt12  |    %XYzt12    |
      | 12%XYzt  |    12%XYzt    |

  @US03_TC05
  Scenario Outline: US03_TC05_strength_password_test
    Given User types into password "<strengthPassword>"
    Then User confirms the password strength "<strength>"
    And User clicks the register button
    And User closes the application
    Examples:
      | strengthPassword | strength |
      | xyzt             | 1        |
      | abcdEFG          | 2        |
      | ABxy123          | 3        |
      | XYzt12%          | 4        |


