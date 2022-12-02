@US013
Feature: US001 Kullanici SSN First Name Last Name kontrolu

  @TC13001 @US013
  Scenario:TC001 Valid bilgiler ile kayit olabilmeli
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici "Doktor" olarak hesaba girer
      | Username  | Password   |
      | drkasan23 | 6412302aS. |
    And "Doctor" clicks on "MY PAGES"
    And "Doctor" clicks on "My Appointments"
    And "Doctor" select "10411" patient clicks your "Edit"
    And "Start DateTime" wait details
    And "Doctor" clicks on "Show Test Results"
    And "Doctor" clicks on "View Results"
    Then "Doctor" should see and verify all test information

  @TC002222 @US013
  Scenario:TC001 Valid bilgiler ile kayit olabilmeli
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici "Doktor" olarak hesaba girer
      | Username  | Password   |
      | drkasan23 | 6412302aS. |
    And "Doctor" clicks on "MY PAGES"
    And "Doctor" clicks on "My Appointments"
    And "Doctor" select "10411" patient id clicks your "Edit"
    And "Doctor" clicks on "Request Inpatient"
    Then "Doctor" verify "A new In Patient is created with identifier 334582" patient






