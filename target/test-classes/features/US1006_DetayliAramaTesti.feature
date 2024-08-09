

  Feature: US1006 Kullanici arattigi kelimenin oldugu urunler bulabildigini test eder

    Scenario: TC14 kullanici arattigi kelimenin bulunan urunlerde gectigini test eder
      Given kullanici toUrl adresine gider
      When arama kutusuna "phone" yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      Then bulunan urunlerden ilkini tiklar
      And acilan sayfadaki urun isminde case sensitive olmadan "phone" bulundugunu test eder
      And acilan ilk urun sayfasindaki urun ismini yazdirir
      And sayfayi kapatir