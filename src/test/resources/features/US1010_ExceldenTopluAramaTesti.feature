Feature:

  Scenario Outline:

    Given kullanici "toUrl" anasayfaya gider
    Then urun excelindeki "<istenenSatir>" daki urunun min. miktarini ve urun ismini kaydeder
    And urun ismini testotomasyonu sayfasinda aratir ve sonuc sayisini kaydeder
    And bulunan urun sayisinin "<istenenSatir>" da verilen min. miktardan fazla oldugunu test eder
    And sayfayi kapatir

    Examples:
      |istenenSatir|
      |2           |
      |3           |
      |4           |
      |5           |
      |6           |
      |7           |
      |8           |
      |9           |
