Feature: Registration related features
  Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA
    When user navigates on the login page
    Then Verify Registration text

  @ValidSSN @smoke_test
  Scenario Outline: User provide valid ssn in the ssn box
    When Type the valid ssn as "<ssn>"
#    Then Verify text that "Your SSN is invalid" is not displayed
    And User closes the application

    Examples:
      |ssn |
      |123-45-6789  |
      |223-45-6789  |
      |001-45-3789|
      |011-46-4789|
      |000-45-7892|
      |000-00-0000|


  @InvalidSSN @smoke_test
  Scenario Outline: User provide multiple invalid ssn in the ssn box
    When Type the multiple invalid ssn as "<ssn>"
#    Then Verify text that "Your SSN is invalid" is displayed
    And User closes the application
    Examples:
      | ssn |
      |12345678991|
      |12345678|
      |001-45-3789|
      |011-46-4789|
      |000-45-7892|
      |000-00-0000|
      |12-45-7899|
      |1234-45-7893|
      |123-1-4444|
      |123-333-7893|
      |123-45-789|
      |123-45-78945|

  @EmptySSN @smoke_test
  Scenario: User don't write any char in the ssn box
    When Click on the ssn box and leave empty ssn
    Then Verify text that "Your SSN is required." is displayed
    And User closes the application


  @ValidFirstName @smoke_test
  Scenario Outline: User provide any char in the first name box
    And Enter SSN number Faker
    And Enter a valid first name into the "<firstname>" box
    And User closes the application
    Examples:
      | ssn | firstname | lastname | username | email | newPassword | confirmPassword |
      | 457-23-7048 | Faraklit | Miracle | ambassader | peace@gmail.com | Slms6666. | Slms6666. |
      | 457-23-7047 | . | Miracle | ambassader | peaces@gmail.com | Slms6666.. | Slms6666.. |
      | 457-23-7046 | 7 | Miracle | ambassader | peacess@gmail.com | Slms6666... | Slms6666... |
      | 457-23-7045 | 0 | Mracless | ambassadrr | peaceesss@gmail.com | Slms6666...s | Slms6666...s |
      | 457-23-7044 | ' | Mraclesss | ambassadrrr | peaceeesss@gmail.com | Slms6666...ss | Slms6666...ss |
      | 457-23-7043 | :) | Mraclessss | ambassadrrrr | peaceeeesss@gmail.com | Slms6666...sss | Slms6666...sss |

  @EmptyFirstName @smoke_test
  Scenario: User don't write any char in the first name box
    And Enter SSN number Faker
    And Click on the firstname box and click Enter
    Then Verify text that contains "Your FirstName is required."
    And User closes the application



  @ValidLastName @smoke_test
  Scenario: User provide any char in the first name box
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And User closes the application

  @EmptyLastName @smoke_test
  Scenario: User don't write any char in the last name box
    And Enter SSN number Faker
    And Enter First Name Faker
    And Click on the lastname box and Enter
    Then Verify text that equals "Your LastName is required."
    And User closes the application

  @US02_Username_Test @smoke_test
  Scenario Outline: US02_Username_Test
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Click on the username box and click  Enter
    Then Verify Your username is required.
    When Enter any chars on the "<username>"
    And Enter Email Address Faker
    When User enters four chars password "<password>"
    And User enters the confirm "<confirmPassword>"
    And User clicks the register button
    Then verify the Registration Saved text
    And User closes the application



    Examples:
      | username  | password  |confirmPassword|
      | .         |  xyzt     |   xyzt        |
      | 1         |  XYZT     |   XYZT        |
      | a         |  1234     |   1234        |
      | B         |  @*%$     |   @*%$        |
      | ½         |  Xy1*     |   Xy1*        |


    @US02_Email_Test @smoke_test
    Scenario Outline: US02_Email_Test
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Enter Username Faker
    And Enter "<email>" box without @ sign and .
    Then Verify the This field is invalid is displayed. text
    And User closes the application
      Examples:
        | email           |
        |nurullahgmail.com|
        |nurullah@gmailcom|
        |nurullahgmailcom |



  @us03_tc01 @smoke_test
  Scenario Outline: US03_TC01
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Enter Username Faker
    And Enter Email Address Faker
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

  @us03_tc02 @smoke_test
  Scenario Outline: US03_TC02
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Enter Username Faker
    And Enter Email Address Faker
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

  @us03_tc03 @smoke_test
  Scenario Outline: US03_TC03
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Enter Username Faker
    And Enter Email Address Faker
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

  @us03_tc04 @smoke_test
  Scenario Outline: US03_TC04
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Enter Username Faker
    And Enter Email Address Faker
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

  @US03_TC05 @smoke_test
  Scenario Outline: US03_TC05_strength_password_test
    And Enter SSN number Faker
    And Enter First Name Faker
    And Enter Last Name Faker
    And Enter Username Faker
    And Enter Email Address Faker
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



