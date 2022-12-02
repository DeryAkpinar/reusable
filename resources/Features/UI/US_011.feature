

  Feature: US_011 "My Appointments" Physician (Doctor) tarafindan duzenlenebilmeli

    Background:
      When Kullanici medunna adresine gider Hk
      And Kullanici anasayfada sag ust kosedeki kisi ikonuna tiklar Hk
      And Kullanici Physician hesabina giris yapmak icin Sign in butonuna tiklar Hk
      Then Kullanici username kismini doldurur Hk
      And Kullanici Password kismini doldurur Hk
      And Kullanici Sign in butonuna tiklar Hk
      Then Kullanici Physician sayfasina basariyla girdigini dogrular Hk
      And Kullanici My Pages sekmesine tiklar Hk
      And Kullanici acilan dropdown menuden  My Appointments secenegine tiklar Hk
      Then Kullanici Appointments yazisini gordugunu dogrular Hk


    Scenario: TC_001 "Create or edit an appointment" islemlerini yapabilmeli

      And Kullanici Edit linkine tiklar Hk
      Then Kullanici Create or Edit an Appointment sayfasinda oldugunu dogrular Hk
      And Kullanici Status kutucugunu tiklayarak secim yapar Hk
      And Kullanici "Anamnesis", "Treatment", "Diagnosis", "Prescription", "Description" kutucuklarina giris yapar Hk
      And Kullanici save linkini tiklar Hk
      Then Kullanici islemlerini basariyla yapabildigini dogrular Hk
      And Sayfayi kapatir Hk

    Scenario: TC_002 Bir randevu guncellendiginde; kullanici (doktor), hastanin asagıdaki bilgilerini gormelidir.
    "id, start and end date, Status, physician and patient"

      And Kullanici hastanin id bilgisini, Start Date Time, End Date Time, Status, Physician, Patient bilgilerini gordugunu dogrular Hk
      And Sayfayi kapatir Hk

    Scenario: TC_003 Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarini doldurmak zorundadir.

      And Kullanici  doldurmasi gerekli alanlari gormek icin Edit linkine tiklar Hk
      And Kullanici sayfanin en altina inip save linkine tiklar Hk
      And Kullanici Anamnesis, Treatment, Diagnosis  alanini doldurmak zorunda oldugunu This field is required yazilarini gorerek dogrular Hk
      And Sayfayi kapatir Hk

    Scenario: TC_004 "Prescription ve description" istege baglı olmalidir.

      And Kullanici  doldurmasi gerekli alanlari gormek icin Edit linkine tiklar Hk
      And Kullanici sayfanin en altina inip save linkine tiklar Hk
      And Kullanici Prescription ve Description alaninin istege bagli oldugunu (zorunlu alan olmadigini) herhangi bir uyari yazisi almayarak dogrular Hk
      And Sayfayi kapatir Hk

    Scenario: TC_005 "Status" doktor tarafindan "PENDING, COMPLETED veya CANCELLED" olarak secilebilmelidir.

      And Kullanici Edit linkine tiklar Hk
      And Kullanici Status kutusundan Pending secenegini tiklar Hk
      And Kullanici Status kutusundan Pending secenegini secebildigini dogrular Hk
      And Kullanici Status kutusundan Completed secenegini tiklar Hk
      And Kullanici Status kutusundan Completed secenegini secebildigini dogrular Hk
      And Kullanici Status kutusundan Cancelled secenegini tiklar Hk
      And Kullanici Status kutusundan Cancelled secenegini secebildigini dogrular Hk
      And Sayfayi kapatir Hk



