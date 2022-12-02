@US09 @US09_UIAdmin @z
Feature:  US09 Admin hasta bilgilerini görebilmeli, düzenleyebilmeli, hasta silebilmeli, SSN Noya göre arama yapamamalıdır

  Background:
    Given Admin "medunnaUrl" sayfasına giderZZ
    And Admin Sayfanın sağ üst köşesindeki human ikonuna tıklarZZ
    And Admin Açılan dropdown menude Sign in seçeneğini seçerZZ
    And Admin Username kutusuna "AdminUsername" girerZZ
    And  Admin Password kutusuna "AdminPassword" girerZZ
    And Admin Sign in butonunu tıklarZZ
    And Admin "adminItemsTitles" dropdown menusune tıklarZZ
    And Admin Açılan dropdown menude "adminPatient" sekmesi seçeneğini seçerZZ

  @TC09_005
  Scenario: TC09_005 Admin "adminItemsTitles" sekmesinden hasta bilgilerini görebilmelidir
    Then Admin Patients bilgilerinin görünür olduğunu test ederZZ
    And Admin sayfayı kapatırZZ

  @TC09_006
  Scenario: TC09_006 Admin butun hasta bilgilerini duzenleyebilmelidirZZ
    Then Admin Patients tablosundaki bilgilerini düzenlemek istediği hastanın yanında yer alan "Edit" butonuna tıklarZZ
    And Admin tüm Patient bilgilerinin duzenlenebildiğini test ederZZ
    And Admin sayfayi kapatirZZ

  @TC09_007
  Scenario: TC09_007 Admin hastaları SSN kimliklerine göre arayamaz
    Then Admin Patient SSN kutusu olmadığından bilgilerini görmek istedigi SSN numarasını giremezZZ
    And Admin hastaları SSN kimliklerine göre arayamadığını test ederZZ
    And Admin sayfayi kapatirZZ

  @TC09_008
  Scenario: TC09_008 Admin herhangi bir hasta bilgisini silebilmelidir
    Then Admin Patients tablosundaki bilgilerini silmek istediği hastanın yanında yer alan "Edit" butonuna tıklarZZ
    And Admin kayıt bilgilerini siler, save butonuna tıklarZZ
    And Admin hasta bilgilerinin silinip silinmediğini test ederZZ
    And Admin sayfayi kapatirZZ
