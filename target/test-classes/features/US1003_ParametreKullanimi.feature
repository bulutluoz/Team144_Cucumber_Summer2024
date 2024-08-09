# 3 scenario olusturup apple, samsung ve headphone aratin ve urun bulunabildigini test edin
  Feature: US1003 kullanici parametre olarak istedigi kelimeyi aratir
    @smoke
    Scenario: TC07 kullanici apple arattiginda urun bulabilmeli

      Given kullanici toUrl adresine gider
      When arama kutusuna "apple" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And bulunan sonuc sayisinin 2'den fazla oldugunu test eder
      #feature dosyasinda int bir deger yazilirsa cucumber parametre olarak kabul eder
      And sayfayi kapatir

    Scenario: TC08 kullanici samsung arattiginda urun bulabilmeli

      Given kullanici toUrl adresine gider
      When arama kutusuna "samsung" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And bulunan sonuc sayisinin 3'den fazla oldugunu test eder
      And sayfayi kapatir

    Scenario: TC09 kullanici headphone arattiginda urun bulabilmeli

      Given kullanici toUrl adresine gider
      When arama kutusuna "headphone" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And bulunan sonuc sayisinin 1'den fazla oldugunu test eder
      And sayfayi kapatir