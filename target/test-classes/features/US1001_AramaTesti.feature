
Feature: US1001 Testotomasyonu.com arama testi

  Scenario: TC01 Kullanici testotomasyonu.com'da phone aratip urun bulabilmeli

    Given kullanici toUrl adresine gider
    Then arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC02 Kullanici testotomasyonu.com'da dress aratip urun bulabilmeli
    Given kullanici toUrl adresine gider
    Then arama kutusuna dress yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  Scenario: TC03 Kullanici testotomasyonu.com'da nutella arattiginda urun bulamamali
    Given kullanici toUrl adresine gider
    Then arama kutusuna nutella yazip aratir
    And arama sonucunda urun bulunamadigini test eder
    And sayfayi kapatir