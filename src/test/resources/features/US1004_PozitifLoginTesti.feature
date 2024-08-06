
  Feature: US1004 kullanici gecerli datalarla sisteme girer

    Scenario: TC10 gecerli degerlerle sisteme giris yapilabilmeli
      Given kullanici toUrl adresine gider
      Then account butonuna basar
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      And basarili giris yapilabildigini test eder
      And 3 saniye bekler
      And sayfayi kapatir
