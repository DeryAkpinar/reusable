@US006
Feature: Kullanici bilgisi sekmesi (Setting) Ana Sayfada duzenlenebilir olmalidir

  @US006_TC001
  Scenario: Kullanici bilgileri firstname, lastname, email girerken doldurulan kullanici bilgileri olmalidir.

    Given Kullanici medunnaUrl'e gider
    When  Kullanici user ikonuna tiklar
    Then  Acilan dropdown menuden sign in butonuna tiklar
    And   Kullanici username ve password bilgilerini girer ve sign in butonuna tiklar
    And   Giris yapan kullanici, isminin oldugu user butonuna tiklar
    And   Acilan dropdown menuden settings e tiklar
    And   Settings sayfasinda firstname bilgisinin oldugunu dogrular
    And   Settings sayfasinda lastname bilgisinin oldugunu dogrular
    And   Settings sayfasinda email bilgisinin oldugunu dogrular
    And   Kullanici sayfayi kapatir

  @US006_TC002
  Scenario: Firstname guncelleme secenegi olmalidir.

    Given Kullanici medunnaUrl'e gider
    When  Kullanici user ikonuna tiklar
    Then  Acilan dropdown menuden sign in butonuna tiklar
    And   Kullanici username ve password bilgilerini girer ve sign in butonuna tiklar
    And   Giris yapan kullanici, isminin oldugu user butonuna tiklar
    And   Acilan dropdown menuden settings e tiklar
    And   Settings sayfasinda yeni Firstname bilgisini girer
    And   Save butonuna tiklar
    And   Kullanici saved oldugunu dogrular
    And   Kullanici sayfayi kapatir


  @US006_TC003
  Scenario: Lastname guncelleme secenegi olmalidir.

    Given Kullanici medunnaUrl'e gider
    When  Kullanici user ikonuna tiklar
    Then  Acilan dropdown menuden sign in butonuna tiklar
    And   Kullanici username ve password bilgilerini girer ve sign in butonuna tiklar
    And   Giris yapan kullanici, isminin oldugu user butonuna tiklar
    And   Acilan dropdown menuden settings e tiklar
    And   Settings sayfasinda yeni Lastname bilgisini girer
    And   Save butonuna tiklar
    And   Kullanici saved oldugunu dogrular
    And   Kullanici sayfayi kapatir

  @US006_TC004
  Scenario: E-mail guncelleme secenegi olmalidir.

    Given Kullanici medunnaUrl'e gider
    When  Kullanici user ikonuna tiklar
    Then  Acilan dropdown menuden sign in butonuna tiklar
    And   Kullanici username ve password bilgilerini girer ve sign in butonuna tiklar
    And   Giris yapan kullanici, isminin oldugu user butonuna tiklar
    And   Acilan dropdown menuden settings e tiklar
    And   Settings sayfasinda yeni E-mail bilgisini girer
    And   Save butonuna tiklar
    And   Kullanici saved oldugunu dogrular
    And   Kullanici sayfayi kapatir






















