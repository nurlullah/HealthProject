@PhysicianViewEditInpatients
  Feature: Physician View - Edit Inpatients Page
    Background:
    Given User goes to url
    When Doctor clicks the sign in symbol
    And Doctor click Sign In dropdown button on HomePage
    And Doctor enters a valid username on Sign In Page
    And Doctor enters a valid password on Sign In Page
    And Doctor clicks the Sign In button on Sign In Page
    And Doctor clicks on MY PAGES
    Then Doctor clicks on My inPatients

    @DoctorViewAllItems
    Scenario: Doctor can view all items
    Then Doctor verifies the all items Inpatient is visible in Inpatient page
    And Doctor closes the application

  #My Inpatient page can not updated as a manually. ı get internal server error.

    #@ItemsCanUpdateOrNotByPhysician
    #Scenario: Doctor can update items especially status
    #Given Doctor clicks edit button in Inpatient page
    #Then Doctor verifies ID can update or not which doctor can not update ID
    #Then Doctor verifies Start Date can update or not which doctor can not update Start Date
    #Then Doctor verifies End Date can update or not which doctor can not update End Date
    #Then Doctor verifies End Date can update or not which doctor can not update End Date
    #Then Doctor verifies Description can update or not which doctor can update Description




