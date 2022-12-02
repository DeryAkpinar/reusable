@US09 @US09_UIStaff @z

Feature: US_009 Staff hasta bilgilerini gorebilmeli duzenleyebilmeli SSN aramasi yapabilmeli hasta bilgisi silebilmeli

  Background:
    Given Staff "medunnaUrl" sayfasına giderZZ
    And Staff Sayfanın sağ üst köşesindeki human ikonuna tıklarZZ
    And Staff Açılan dropdown menude Sign in seçeneğini seçerZZ
    And Staff Username kutusuna "StaffUsername" girerZZ
    And Staff Password kutusuna "StaffPassword" girerZZ
    And Staff Sign in butonunu tıklarZZ
    And Staff MY PAGES dropdown menusune tiklarZZ
    And Staff Açılan dropdown menude "Search Patient" seçeneğini seçerZZ

  @TC09_001
  Scenario: TC09_001 Staff "My Pages" sekmesinden hasta bilgilerini görebilmelidir
    Then Staff Search Patients sekmesinde hasta bilgilerinin gorunur oldugunu test ederZZ
    And Staff sayfayi kapatirZZ

  @TC09_002
 Scenario: TC09_002 Staff butun hasta bilgilerini duzenleyebilmelidir
   Given Staff Patients tablosundaki bilgilerini düzenlemek istediği hastanın yanında yer alan "Edit" butonuna tıklarZZ
   Then Staff tüm hasta bilgilerinin duzenlenebilir oldugunu test ederZZ
   And Staff sayfayi kapatirZZ

  @TC09_003
 Scenario: TC09_003 Staff SSN'lerine gore yeni bir basvuru sahibi arayabilmeli ve tum kayit bilgilerinin dolduruldugunu gorebilmelidir
   Given Staff Patient SSN kutusuna bilgilerini görmek istedigi SSN numarasını girerZZ
   And Staff Patient bilgisinin yanında yer alan "View" butonunu tıklarZZ
   Then Staff kayit bilgilerinin gorunur oldugunu test ederZZ
   And Staff sayfayi kapatirZZ

  @TC09_004
 Scenario: TC09_004 Staff herhangi bir hasta bilgisini silebilir
   Given  Staff Patients tablosundaki bilgilerini silmek istediği hastanın yanında yer alan "Edit" butonuna tıklarZZ
   And Staff kayıt bilgilerini siler, save butonuna tıklarZZ
   Then Staff hasta bilgilerinin silinip silinmediğini test ederZZ
   And Staff sayfayi kapatirZZ