@US002API
Feature:  US_002 API Test

  Scenario Outline: TC007 API kullanilarak username ve email dogrulanmali

    Given FA Kullanici yeni kaydin kayit bilgilerine get request gönderir "<url>"
    When FA Kullanici status kodunun 200 oldugunu görür.
    Then FA Kullanici username ve email  dogrular

    Examples:
      |url   |
      |https://www.medunna.com/api/user?ssn=332-61-3332|

