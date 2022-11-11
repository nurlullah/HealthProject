@US023-01
Feature: US023 Payment Invoice By Staff

   Background:
    Given user goes to URL
    Then verify the page title contains MEDUNNA
    When user navigates on the login page

  Scenario:
    When user patient enters username and click on login button
    Then user patient click on the My Pages from dropdown
    And user clicks on the make an appointment icon
    And user clicks on send an appointment button

  @US023-02
  Scenario: US023-TC002 User Staff approves the created appointment
    And user signs in as Staff
    Then user staff clicks on MYPAGE dropdown
    And user staff clikcs on Search Patient button
    Then user staff enters patients SSN box "patientSsnBoxValue"
    And user staff clicks on show appointments button
    And user staff clicks on edit button for cretaed appointment
    And user staff selects pending for appointment status
    And user staff assigns the doctor for the patient as "team02_physician_data"
    And user staff cliks on save button
#
#  Scenario: US023-TC003 Kullanici Doktor rolu ile atanan randevunun islemlerini tamamlar
#    And kullanici doktor rolu ile oturum acar
#    Then kullanici doktor mypage acilir butonuna tiklar
#    And kullanici my appointments butonuna tiklar
#    And kullanici atanan randevunun edit butonuna tiklar
#    Then kullanici Request A Test butonuna tiklar
#    And kullanici cccs, Sodium ve Urea testlerini secer
#    And kullanici test bolumu save butonuna tiklar
#    Then kullanici status kutusundan completed secenegini secer
#    And kullanici anamneis, treatment, diagnosis kutularini doldurur
#    And kullanici create bolumu save butonuna tiklar
#
#  Scenario: US023-TC004 kullanici Staff rolu ile islemleri tamamlanan hastaya fatura olusturur
#    And kullanici staff rolu ile oturum acar
#    Then kullanici staff mypage acilir butonuna tiklar
#    And kullanici search patient butonuna tiklar
#    Then kullanici patient SSN bolumune "426-64-2470" nolu SSN no girer
#    And kullanici show appointments butonuna tiklar
#    Then kullanici fatura icin hastanin payment butonuna tiklar
#    And kullanici create invoice butonuna tiklar
#    And kullanici create or edit sayfasinda save butonuna tiklar
#    Then kullanici patient SSN bolumune "426-64-2470" nolu SSN no girer
#    And kullanici show appointments butonuna tiklar
#    Then kullanici fatura icin hastanin payment butonuna tiklar
#    And kullanici show invoice butonuna tiklar
#    And kullanici faturanin olustugunu dogrular
