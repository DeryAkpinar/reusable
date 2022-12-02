@US010
Feature:Doktor (Physician) randevulari

  @US010_TC001
  Scenario: Doktor, randevu listesini ve zaman dilimlerini My Appointments sekmesinden gorebilmelidir

    Given Kullanici doktor medunnaUrl'e gider
    When  Kullanici doktor user ikonuna tiklar
    Then  Kullanici doktor acilan dropdown menuden sign in butonuna tiklar
    And   Kullanici doktor olarak username ve password bilgilerini girer ve sign in butonuna tiklar
    And   Kullanici doktor Mypages butonuna tiklar
    And   Acilan dropdown menuden  Myappointments butonuna tiklar
    And   Kullanici doktor acilan sayfada randevu listesinin ve zaman dilimlerinin oldugunu dogrular
    And   Sayfayi kapatir

  @US010_TC002
  Scenario: Doktor patient id, start date, end date, status bilgilerini gorebilmelidir

    Given Kullanici doktor medunnaUrl'e gider
    When  Kullanici doktor user ikonuna tiklar
    Then  Kullanici doktor acilan dropdown menuden sign in butonuna tiklar
    And   Kullanici doktor olarak username ve password bilgilerini girer ve sign in butonuna tiklar
    And   Kullanici doktor Mypages butonuna tiklar
    And   Acilan dropdown menuden  Myappointments butonuna tiklar
    And   Kullanici doktor acilan sayfada patient id, start date, end date, status bilgilerinin oldugunu dogrular
    And   Sayfayi kapatir

















