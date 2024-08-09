
  Feature: US1011 istenen durumlarda screenshot alinabilmeli

    Scenario: TC19 Tum sayfa veya webelement screenshot
      # eger test failed olursa, failed olan asamada screenshot alip, rapora ekleyin

      Given kullanici "toUrl" anasayfaya gider
      When belirlenmis aranacak kelimeyi aratir
      Then arama sonucunda urun bulunabildigini test eder
      And 1 saniye bekler
      And tum sayfanin screenshot'ini alir ve "aramaTesti" ismiyle kaydeder
      Then bulunan urunlerden ilkini tiklar
      And acilan sayfadaki urun isminde case sensitive olmadan belirlenmis aranacak bulundugunu test eder
      And 1 saniye bekler
      And acilan ilk urun sayfasindaki urun isminin screenshoot'ini alir


