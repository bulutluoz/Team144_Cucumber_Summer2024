package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class TestotomasyonuStepdefinitions {
    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

    @Given("kullanici toUrl adresine gider")
    public void kullanici_to_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @Then("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {

        Assertions.assertTrue(testOtomasyonuPage.bulunanUrunElementleriList.size() > 0);

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @Then("arama kutusuna dress yazip aratir")
    public void arama_kutusuna_dress_yazip_aratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @Then("arama kutusuna nutella yazip aratir")
    public void aramaKutusunaNutellaYazipAratir() {
        testOtomasyonuPage.aramaKutusu.sendKeys("nutella" + Keys.ENTER);
    }

    @And("arama sonucunda urun bulunamadigini test eder")
    public void aramaSonucundaUrunBulunamadiginiTestEder() {

        String expectedSonucYazisi = "0 Products Found";
        String actualSonucYazisi = testOtomasyonuPage.aramaSonucuElementi
                                                        .getText();

        Assertions.assertEquals(expectedSonucYazisi,actualSonucYazisi);
    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String istenenKelime) {

        testOtomasyonuPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);

    }

    @And("bulunan sonuc sayisinin {int}'den fazla oldugunu test eder")
    public void bulunanSonucSayisininDenFazlaOldugunuTestEder(int minSonucSayisi) {

        Assertions.assertTrue(testOtomasyonuPage.bulunanUrunElementleriList.size() >= minSonucSayisi);
    }

    @Then("account butonuna basar")
    public void account_butonuna_basar() {
        testOtomasyonuPage.accountLinki
                .click();
    }
    @Then("email olarak {string} girer")
    public void email_olarak_girer(String configdenAlinacakEmail) {

        testOtomasyonuPage.loginEmailKutusu
                            .sendKeys(ConfigReader.getProperty(configdenAlinacakEmail));

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String configdenAlinacakPassword) {

        testOtomasyonuPage.loginPasswordKutusu
                .sendKeys(ConfigReader.getProperty(configdenAlinacakPassword));
    }
    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {
        testOtomasyonuPage.loginSignInButonu
                .click();
    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        // logout butonunun gorunur olmasi ile testi yapalim
        Assertions.assertTrue(testOtomasyonuPage.logoutButonu.isDisplayed());
    }
    @Then("{int} saniye bekler")
    public void saniye_bekler(Integer beklenecekSaniye) {

        ReusableMethods.bekle(beklenecekSaniye);
    }

    @Then("sisteme giris yapilamadigini test eder")
    public void sistemeGirisYapilamadiginiTestEder() {
        // sisteme giris yapilamadigini email kutusunun hala gorunur olmasi ile test edelim
        Assertions.assertTrue(testOtomasyonuPage.loginEmailKutusu.isDisplayed());

    }

    @Then("bulunan urunlerden ilkini tiklar")
    public void bulunan_urunlerden_ilkini_tiklar() {

    }
    @Then("acilan sayfadaki urun isminde case sensitive olmadan {string} bulundugunu test eder")
    public void acilan_sayfadaki_urun_isminde_case_sensitive_olmadan_bulundugunu_test_eder(String string) {

    }
    @Then("acilan ilk urun sayfasindaki urun ismini yazdirir")
    public void acilan_ilk_urun_sayfasindaki_urun_ismini_yazdirir() {

    }
}
