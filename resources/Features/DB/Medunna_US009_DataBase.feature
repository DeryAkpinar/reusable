
@US09 @US09DB @z
Feature: US09 Staff (Personel) hasta bilgilerini gorebilmeli duzenleyebilmeli fakat silememelidir

  Scenario: TC09 Kullanıcı DB kullanarak tüm hasta bilgilerini doğrulamalıdır.
    Given Kullanici medunna database e baglanirZZ
    Then Kullanici database'den tum hasta bilgilerini alirZZ
    And Kullanıcı database bağlantısını kapatırZZ
