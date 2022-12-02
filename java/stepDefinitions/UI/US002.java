package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPageFA;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002 {
    Actions action = new Actions(Driver.getDriver());
    MedunnaPageFA medunnaPage = new MedunnaPageFA();


    @Given("FA Kullanici {string} sayfasina gider")
    public void fakullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("FA Account icon una tiklar")
    public void faaccountIconUnaTiklar() {

        ReusableMethods.jsScrollClick(medunnaPage.accountMenuFA);
    }

    @And("FA Acilan menuden Register a tiklar")
    public void faacilanMenudenRegisterATiklar() {

        ReusableMethods.jsScrollClick(medunnaPage.registerFristFA);
    }


    @And("FA Gecerli SSN {string} girer")
    public void fagecerliSSNGirer(String SSN) {
        medunnaPage.ssnFA.sendKeys(SSN);

    }

    @And("FA Gecerli Firstname {string} girer")
    public void fagecerliFirstnameGirer(String Firstname) {
        medunnaPage.firstnameFA.sendKeys(Firstname);
    }

    @And("FA Gecerli Lastname {string} girer")
    public void fagecerliLastnameGirer(String Lastname) {
        medunnaPage.lastnameFA.sendKeys(Lastname);
    }

    @And("FA Gecerli bir username {string} girer")
    public void fagecerliBirUsernameGirer(String username) {
        medunnaPage.usernameFA.sendKeys(username);
    }

    @And("FA Gecerli email {string} girer")
    public void fagecerliEmailGirer(String email) {
        medunnaPage.emailFA.sendKeys(email);
    }

    @And("FA Guclu bir password {string} girer")
    public void fagucluBirPasswordGirer(String password) {
        medunnaPage.firstPasswordFA.sendKeys(password);
    }

    @And("FA Guclu password {string} u onaylar")
    public void fagucluPasswordUOnaylar(String comfirmationPassword) {
        medunnaPage.comfirmationPasswordFA.sendKeys(comfirmationPassword);
    }

    @And("FA Register a tıklar")
    public void faregisterATıklar() {

        ReusableMethods.jsScrollClick(medunnaPage.registerSubmitFA);
    }


    @Then("FA Kullanici Register Saved  yazisini görerek basarili ön kayit oldugunu görür")
    public void fakullaniciRegisterSavedYazisiniGörerekBasariliÖnKayitOldugunuGörür() {
        Assert.assertTrue(medunnaPage.registerSavedFA.isDisplayed());
    }

    //  TC002
    @And("FA Kullanıcı username username i bos bırakır")
    public void fakullanıcıUsernameUsernameIBosBırakır() {

        ReusableMethods.jsScrollClick(medunnaPage.usernameFA);

        ReusableMethods.jsScrollClick(medunnaPage.emailFA);


    }

    @Then("FA Kullanici username altinda Your username is required yazisini gorur")
    public void fakullaniciUsernameAltindaYourUsernameIsRequiredYazisiniGorur() {
        Assert.assertTrue( medunnaPage.yourUserNameisRequiredFA.isDisplayed());
    }

    //TC003
    @And("FA Kullanici Turkce harf iceren username  girer")
    public void fakullaniciTurkceHarfIcerenUsernameGirer() {
        medunnaPage.usernameFA.sendKeys("ayşeöz");
        Assert.assertFalse("Kullanici turkce harf iceren username giremiyor",false);
        ReusableMethods.jsScrollClick(medunnaPage.emailFA);
    }


    //TC004
    @And("FA Kullanici herhangi bir karakter iceren username girer")
    public void fakullaniciHerhangiBirKarakterIcerenUsernameGirer() {
        medunnaPage.usernameFA.sendKeys("ay$eoz");
        Assert.assertFalse("kullanıcı herhangi karakter iceren username giremiyo",false);
        ReusableMethods.jsScrollClick(medunnaPage.emailFA);

    }

    @Then("FA Kullanici username altinda Your username is invalid. yazisini gorur")
    public void fakullaniciUsernameAltindaYourUsernameIsInvalidYazisiniGorur() {
        Assert.assertTrue(medunnaPage.yourUserNameisInvalidFA.isDisplayed());
    }


    //TC005
    @And("FA Kullanici nokta isareti olmadan email {string} girer")
    public void fakullaniciNoktaIsaretiOlmadanEmailGirer(String email1) {
        medunnaPage.emailFA.sendKeys(email1);
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();



    }

    @And("FA Kullanici @ isareti olmadan email {string} girer")
    public void fakullaniciIsaretiOlmadanEmailGirer(String email2) {
        medunnaPage.emailFA.clear();
        ReusableMethods.waitFor(2);
        medunnaPage.emailFA.sendKeys(email2);
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("FA Kullanıcı @venokta olmadan email {string} girer")
    public void fakullanıcıVenoktaOlmadanEmailGirer(String email3) {
        medunnaPage.emailFA.clear();
        ReusableMethods.waitFor(2);
        medunnaPage.emailFA.sendKeys(email3);
        ReusableMethods.waitFor(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("FA Kullanici email altında This field is invalid yazisini gorur.")
    public void fakullaniciEmailAltındaThisFieldIsInvalidYazisiniGorur() {
        Assert.assertTrue(medunnaPage.thisFiledisInvalidFA.isDisplayed());

    }

    @And("FA sayfayı kapatır")
    public void fasayfayıKapatır() {
        Driver.quitDriver();
    }




}
