package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;



public class SaucedemoStepdefinitions {

    SaucedemoPage saucedemoPage = new SaucedemoPage();
    String secilenUrununIsmi;

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String configGidilecekUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(configGidilecekUrl));
    }

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String direktUsername) {
        saucedemoPage.usernameKutusu.sendKeys(direktUsername);
    }

    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String direktPassword) {
        saucedemoPage.passwordKutusu.sendKeys(direktPassword);
    }

    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        saucedemoPage.loginButonu.click();
    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        secilenUrununIsmi = saucedemoPage.tumUrunElementleriList
                                            .get(0)
                                            .getText();

        saucedemoPage.tumUrunElementleriList
                        .get(0)
                        .click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {

    }


}
