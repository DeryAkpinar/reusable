@US001smoke
Feature: US001 Kullanici SSN First Name Last Name kontrolu

  @TC001 @US001
  Scenario:TC001 Valid bilgiler ile kayit olabilmeli
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici kayit bilgilerini girer
      | SSN         | First Name | Last Name | Username      | Email                  | New password | New password confirmation |
      | 347-80-0327 | sinan      | sarikaya  | njk4366441241 | 14b25423jsf1@gmail.com | 6412302aS.   | 6412302aS.                |
    Then kullanici kayit sayfasini acar

  @TC002 @US001
  Scenario:TC002 kullanici invalid SSN numarasi ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "SSN" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 391-00-9856 | sinan      | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |




  @TC003 @US001
  Scenario:TC003 kullanici invalid First Name ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "First Name" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 323-06-7327 | sinan*     | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC004 @US001
  Scenario:TC004 kullanici invalid Last Name ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "Last Name" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 323-06-7327 | sinan      | sarikaya= | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC005 @US001
  Scenario:TC005 kullanici invalid SSN numarasi ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "SSN" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 991-85-9856 | sinan      | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC006 @US001
  Scenario:TC006 kullanici invalid SSN numarasi ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "SSN" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 234-85-0000 | sinan      | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC007 @US001
  Scenario:TC007 kullanici invalid First Name ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "First Name" bilgisi kayit olamadigini dogrular
      | SSN         | First Name  | Last Name | Username | Email             | New password | New password confirmation |
      | 234-85-0000 | sinan321324 | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC008 @US001
  Scenario:TC008 kullanici  bos First Name ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "First Name" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 234-85-0000 | \n         | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC009 @US001
  Scenario:TC009 kullanici bos Last Name ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "Last Name" bilgisi kayit olamadigini dogrular
      | SSN         | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | 234-85-0000 | sinan      | \n        | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |

  @TC010 @US001
  Scenario:TC010 kullanici bos SSN numarasi ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar
    Then kullanici invalid "SSN" bilgisi kayit olamadigini dogrular
      | SSN | First Name | Last Name | Username | Email             | New password | New password confirmation |
      | \n  | sinan      | sarikaya  | njkraste | njk1234@gmail.com | 6412302aS.   | 6412302aS.                |


  @TC011
  Scenario:TC010 kullanici bos SSN numarasi ile kayit olamaz
    Given kullanici "medunnaUrl" url'e gider
    Then kullanici kayit sayfasini acar









