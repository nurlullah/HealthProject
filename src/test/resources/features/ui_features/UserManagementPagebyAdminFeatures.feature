@AdminViewEditUserManagementPage
Feature: Physician View - Edit Inpatients Page

    @AdminViewInformationOfUsers
    Scenario: Admin finds existing users and can view information about them
      Given User goes to url
      When Admin clicks the sign in symbol
      And Admin click Sign In dropdown button on HomePage
      And Admin enters a valid username on Sign In Page
      And Admin enters a valid password on Sign In Page
      And Admin clicks the Sign In button on Sign In Page
      And Admin clicks on Administration sign
      And Admin clicks on User Management drop down
      Given Admin clicks view button on User Management Page
      Then Admin verifies first name, last name, email and other credentials in view page
      And Admin closes the application

      @AdminEditRolePartOfUsers
      Scenario: Admin finds existing users and can edit role part
        Given User goes to url
        When Admin clicks the sign in symbol
        And Admin click Sign In dropdown button on HomePage
        And Admin enters a valid username on Sign In Page
        And Admin enters a valid password on Sign In Page
        And Admin clicks the Sign In button on Sign In Page
        And Admin clicks on Administration sign
        And Admin clicks on User Management drop down
      Given Admin clicks edit button on User Management Page
      And Admin assigns role to the user
      And Admin clicks on Save button
      And Admin closes the application

      @AdminCanActivateUserStatus
      Scenario: Admin finds existing users and can edit activated part
        Given User goes to url
        When Admin clicks the sign in symbol
        And Admin click Sign In dropdown button on HomePage
        And Admin enters a valid username on Sign In Page
        And Admin enters a valid password on Sign In Page
        And Admin clicks the Sign In button on Sign In Page
        And Admin clicks on Administration sign
        And Admin clicks on User Management drop down
      Given Admin clicks edit button on User Management Page
      And Admin activates user's status
      And Admin clicks on Save button
      And Admin closes the application

      @AdminCanDeleteUser
      Scenario Outline: Admin finds existing users and can delete users
        Given user goes to URL
        Then verify the page title contains MEDUNNA
        When User clicks the sign in symbol and register dropdown button
        Then Verify Registration text
        And Enter SSN number Faker
        And Enter First Name Faker
        And Enter Last Name Faker
        And Enter Username Faker
        And Enter Email Address Faker
        Given User enters four chars password "<password>"
        And User enters the confirm "<confirmPassword>"
        And User clicks the register button
        Then verify the Registration Saved text
        And User closes the application
        Given User goes to url
        When Admin clicks the sign in symbol
        And Admin click Sign In dropdown button on HomePage
        And Admin enters a valid username on Sign In Page
        And Admin enters a valid password on Sign In Page
        And Admin clicks the Sign In button on Sign In Page
        And Admin clicks on Administration sign
        And Admin clicks on User Management drop down
        And Admin deletes the user
        And Admin closes the application
        Examples:
          | password | confirmPassword |
          | xyzt     |   xyzt          |












