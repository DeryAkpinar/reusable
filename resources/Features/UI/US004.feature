Feature:US004 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

  Scenario: TC_001 Giris yapmak icin basari mesajını doğrulayan, gecerli bir kullanici adi ve sifre olmalidir.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And gecerli username girer
    And gecersiz password girer
    And SignIn butonuna tiklar
    And giris yapilamadigi dogrulanir



  Scenario: TC_002 Giris yapmak icin basari mesajını doğrulayan, gecerli bir kullanici adi ve sifre olmalidir.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And Kullanici gecersiz username girer
    And Kullanici gecerli password girer
    And SignIn butonuna tiklar
    And giris yapilamadigi dogrulanir


  Scenario: TC_003 Giris yapmak icin basari mesajını doğrulayan, gecerli bir kullanici adi ve sifre olmalidir.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And Kullanici gecersiz username girer
    And gecersiz password girer
    And SignIn butonuna tiklar
    And giris yapilamadigi dogrulanir

  Scenario: TC_004 Giris yapmak icin basari mesajını doğrulayan, gecerli bir kullanici adi ve sifre olmalidir.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And gecerli username girer
    And Kullanici gecerli password girer
    And SignIn butonuna tiklar
    And Sayfaya basarili giris yapildigi dogrulanir

  Scenario: TC_005 Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği, "Remember me" seçeneği olmalıdır
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And Remember me oldugu dogrulanir

  Scenario: TC_006 Eğer şifre unutulursa diye "Did you forget your password?" seçeneği olmalıdır.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And Did you forget your password?  seçeneği oldugu dogrulanir

  Scenario: TC_007 "You don't have an account yet? Register a new account" seçeneği olmalıdır.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And You don't have an account yet? Register a new account  seçeneği oldugu dogrulanir

  Scenario: TC_008 "Cancel" seçeneği olmalıdır.
    Given kullanici "medunnaUrl" url'e gider
    When sag ust kosede yer alan kisi ikonuna tiklar
    Then Sign in butonuna tiklar
    And  Cancel secenegi oldugu dogrulanir
