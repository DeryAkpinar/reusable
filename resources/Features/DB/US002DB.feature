@DBTest
Feature:US002 DB email dogrulama


  Scenario Outline: TC006 Database ile email dogrulanmali
  Given FA Kullanici connection kurar
   When FA Kullanici  tum bilgilerini alir "<query>"
   Then FA Kullanici   emaili dogrular "<query>"

    Examples:
    |query        |
    |Select * from public.jhi_user where ssn='332-61-3332'|
