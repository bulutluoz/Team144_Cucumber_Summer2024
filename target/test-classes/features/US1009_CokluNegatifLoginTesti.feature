
  Feature: US1009 kullanici verilen yanlis bilgilerle giris yapamaz

    Scenario Outline: TC17 kullanici liste olarak verilen gecersiz email ve password'ler ile
                      giris yapilamadigini test eder

      Given kullanici toUrl adresine gider
      Then account butonuna basar
      When email olarak direkt verilen "<verilenEmail>" girer
      And password olarak direkt verilen "<verilenPassword>" girer
      And signIn butonuna basar
      Then sisteme giris yapilamadigini test eder
      And sayfayi kapatir

      Examples:
      |verilenEmail       |verilenPassword|
      |mustafa@gmail.com  |1234567        |
      |levent@hotmail.com |3456789        |
      |ismail@mymail.com  |6575663456     |
      |rana@rmail.com     |ertyuhgf       |