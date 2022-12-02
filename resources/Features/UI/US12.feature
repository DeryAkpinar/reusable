@US012 @z

Feature: US012

  Background: Ortak Adimlar
    Given Doctor "medunnaUrl" sayfasına giderZZ
    And  Sayfanın sağ üst köşesindeki human ikonuna tıklarZZ
    And Açılan dropdown menude Sign in seçeneğini seçerZZ
    And Username kutusuna "DoctorUsername" girerZZ
    And Password kutusuna "DoctorPassword" girerZZ
    And Sign in butonunu tıklarZZ
    And  MY PAGES dropdown menusune tıklarZZ
    And My Appointments seçeneğini seçerZZ
    And Atanan hasta için Edit butonunu tıklarZZ
    And Request A Test butonunu tıklarZZ

  @TC12_01
  Scenario: TC12_01
    Then Test Items yazısının görünür olduğunu test ederZZ
    And Sayfayı kapatırZZ

  @TC12_02
  Scenario: TC12_02
    Then Test Items tablosunda Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin seçenekleri olduğunu test ederZZ
    And Sayfayı kapatırZZ
