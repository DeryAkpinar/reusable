Feature:US_002 Kayit olmak icin email ve username girişi


  Scenario Outline: TC_002 Kayit olmak icin gecerli email ve yanlis username girisi
    Given FA Kullanici "https://medunna.com/" sayfasina gider
    When FA Account icon una tiklar
    And  FA Acilan menuden Register a tiklar
    And  FA Gecerli SSN "<SSN>" girer
    And  FA Gecerli Firstname "<Firstname>" girer
    And  FA Gecerli Lastname "<Lastname>" girer
    And FA Kullanıcı username username i bos bırakır
    Then FA Kullanici username altinda Your username is required yazisini gorur

    Examples:
      |SSN         | Firstname  |  Lastname  |
      |123-11-1213 |Ayse        |Oz          |


  Scenario Outline: TC_003 Kayit olmak icin gecerli email ve Turkce harf iceren username girisi
    Given FA Kullanici "https://medunna.com/" sayfasina gider
    When FA Account icon una tiklar
    And  FA Acilan menuden Register a tiklar
    And  FA Gecerli SSN "<SSN>" girer
    And  FA Gecerli Firstname "<Firstname>" girer
    And  FA Gecerli Lastname "<Lastname>" girer
    And  FA Kullanici Turkce harf iceren username  girer
    Then FA Kullanici username altinda Your username is invalid. yazisini gorur

    Examples:
      |SSN         | Firstname  |  Lastname  |
      |123-11-1213 |Ayse        |Oz          |

  Scenario Outline: TC_004 Kayit olmak icin gecerli email herhangi bir karakter iceren username girisi
    Given FA Kullanici "https://medunna.com/" sayfasina gider
    When FA Account icon una tiklar
    And  FA Acilan menuden Register a tiklar
    And  FA Gecerli SSN "<SSN>" girer
    And  FA Gecerli Firstname "<Firstname>" girer
    And  FA Gecerli Lastname "<Lastname>" girer
    And  FA Kullanici herhangi bir karakter iceren username girer
    Then FA Kullanici username altinda Your username is invalid. yazisini gorur

    Examples:
      |SSN         | Firstname  |  Lastname  |
      |123-11-1213 |Ayse        |  Oz        |

  Scenario Outline: TC_005 Kayit olmak icin gecersiz email gecerli username girisi
    Given FA Kullanici "https://medunna.com/" sayfasina gider
    When FA Account icon una tiklar
    And  FA Acilan menuden Register a tiklar
    And  FA Gecerli SSN "<SSN>" girer
    And  FA Gecerli Firstname "<Firstname>" girer
    And  FA Gecerli Lastname "<Lastname>" girer
    And  FA Gecerli bir username "<username>" girer
    And  FA Kullanici nokta isareti olmadan email "<email1>" girer
    And  FA Kullanici email altında This field is invalid yazisini gorur.
    And  FA Kullanici @ isareti olmadan email "<email2>" girer
    And  FA Kullanici email altında This field is invalid yazisini gorur.
    And  FA Kullanıcı @venokta olmadan email "<email3>" girer
    And  FA Kullanici email altında This field is invalid yazisini gorur.

    Examples:
      |SSN         | Firstname  |  Lastname  | username | email1             |  email2          | email3          |
      |123-11-1213 |Ayse        |Oz          | ayseoz   |ayseoz@gmailcom     |ayseozgmail.com  |ayseozgmailcom |

  Scenario Outline: TC_001 Kayit olmak için gecerli email ve username bilgileri girilebilmelidir
    Given FA Kullanici "https://medunna.com/" sayfasina gider
    When FA Account icon una tiklar
    And  FA Acilan menuden Register a tiklar
    And  FA Gecerli SSN "<SSN>" girer
    And  FA Gecerli Firstname "<Firstname>" girer
    And  FA Gecerli Lastname "<Lastname>" girer
    And  FA Gecerli bir username "<username>" girer
    And  FA Gecerli email "<email>" girer
    And  FA Guclu bir password "<password>" girer
    And  FA Guclu password "<comfirmationPassword>" u onaylar
    And  FA Register a tıklar
    Then FA Kullanici Register Saved  yazisini görerek basarili ön kayit oldugunu görür
    And sayfayı kapatır


    Examples:
      |SSN         | Firstname  |  Lastname  | username | email              |  password   | comfirmationPassword  |
      |123-11-1213 |Ayse        |Oz          | ayseoz   |ayseoz@gmail.com    | A.oz123     | A.oz123               |


