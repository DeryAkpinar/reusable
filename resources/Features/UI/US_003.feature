
  Feature: US_003 Registration sayfasinda guclu sifre girilmeli ve "Password strength" seviyeleri gorulebilmeli

    Background:
      When Kullanici medunna adresine gider Hk
      And Kullanici anasayfada sag ust kosedeki kisi ikonuna tiklar Hk
      Then Kullanici acilan dropdown menuden Register butonuna tiklar Hk
      And Kullanici kayit olmak icin Registiration sayfasina girdigini dogrular Hk
      And Kullanici New Password kutusuna tiklar Hk


    Scenario Outline: TC_001 Daha guclu sifre icin en az 1 kucuk harf olmali ve "Password strength" seviyesinin degistigi gorulebilmeli

      And Kullanici en az bir veya daha fazla kucuk harf kullanilan bir "<sifre>" girer Hk
      Then Kullanici  Password strength seviyesinin ikinci seviyeye gectigini dogrular Hk
      Examples:
        | sifre |
        | 598751a |
        | 56958kl |
        | KENlric |

    Scenario Outline: TC_002 Sifre en az 1 buyuk harf icermeli ve "Password strength" seviyesinin degistigi gorulebilmeli

      And Kullanici en az bir veya daha fazla buyuk harf kullanilan bir "<sifre>" girer Hk
      Then Kullanici  Password strength seviyesinin ikinci seviyeye gectigini dogrular Hk
      Examples:
        | sifre |
        | 695485K |
        | 75265AY |
        | synAJEP |

    Scenario Outline: TC_003 Sifre en az 1 rakam icermeli ve "Password strength" seviyesinin degistigi gorulebilmeli

      And Kullanici en az bir veya daha fazla rakam kullanilan bir "<sifre>" girer Hk
      Then Kullanici  Password strength seviyesinin ikinci seviyeye gectigini dogrular Hk
      Examples:
        | sifre |
        | sjricj3 |
        | fkeix37 |
        | dke7531 |

    Scenario Outline: TC_004 Sifre en az 1 ozel karakter icermeli ve"Password strength" seviyesinin degistigi gorulebilmeli

      And Kullanici en az bir veya daha fazla ozel karakter kullanilan bir "<sifre>" girer Hk
      Then Kullanici  Password strength seviyesinin besinci seviyeye gectigini dogrular Hk
      Examples:
        | sifre |
        | sjricj3 |
        | fkeix37 |
        | dke7531 |

    Scenario Outline: TC_005 Gecerli bir parola icin en az 4 karakter olmalidir

      And Kullanici SSN no girisi yapar Hk
      And Kullanici "First Name" , "Last Name" , "Username" , "Email" girisi yapar Hk
      And Kullanici New Password kutusuna tiklar Hk
      And Kullanici dort karakter iceren bir "<sifre>" girer Hk
      And Kullanici New Password Confirmation kutusuna "<sifre>" yi tekrar girer Hk
      And Kullanci Register butonuna tiklar Hk
      Then Kullanici  dort karakterli bir sifre ile kayit olabildigini dogrular. Hk
      Examples:
        | sifre |
        | aF3= |


    Scenario Outline: TC_005(Negative Test) Gecerli bir parola icin en az 4 karakter olmalidir

      And Kullanici en fazla uc  veya daha az karakter iceren bir "<sifre>" girer Hk
      And Kullanici New Password Confirmation kutusuna en fazla uc  veya daha az karakter iceren "<sifre>" yi tekrar girer Hk
      Then  Kullanici gecerli parola icin en az dort karakter girmesi gerektigi mesajini gordugunu dogrular. Hk
      And Sayfayi kapatir Hk

      Examples:
        | sifre |
        | fke |
        | 395 |
        | DN= |

    Scenario Outline: TC_006 Guclu bir parola icin sifre en az 7 karakterden olusmalidir.

      And Kullanici buyuk ve kucuk harf, rakam ve ozel karakter iceren en az yedi karakterli bir "<sifre>" girer Hk
      And Kullanici  Password strength seviyesinin besinci seviyeye gectigini dogrular Hk
      And Sayfayi kapatir Hk

      Examples:
        | sifre |
        | akME84? |
        | LWkW4/> |

    Scenario Outline: TC_006(Negative Test) Guclu bir parola icin sifre en az 7 karakterden olusmalidir.

      And Kullanici yalniz kucuk, yalniz buyuk, yalniz rakam ve yalniz ozel karakterlerden olusan en az yedi veya daha fazla karakter iceren "<sifreler>" girer Hk
      And Kullanici  Password strength seviyesinin guclenmedigini, birinci seviyede kaldigini dogrular Hk
      And Sayfayi kapatir Hk

      Examples:
        | sifreler |
        | akrivjeslkadwlkwlklmdwmakle |
        | ARICMEKEKOEJDIWS |
        | 49204964 |
        | */']=-?&(@ |



