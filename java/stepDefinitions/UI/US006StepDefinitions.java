package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedmeminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US006StepDefinitions {

    MedmeminPages mPage = new MedmeminPages();


    @Given("Kullanici medunnaUrl'e gider")
    public void kullaniciMedunnaUrlEGider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("Kullanici user ikonuna tiklar")
    public void kullaniciUserIkonunaTiklar() {

        mPage.accountMenu.click();
    }

    @Then("Acilan dropdown menuden sign in butonuna tiklar")
    public void acilanDropdownMenudenSignInButonunaTiklar() {

        mPage.dropSign.click();
    }

    @And("Kullanici username ve password bilgilerini girer ve sign in butonuna tiklar")
    public void kullaniciUsernameVePasswordBilgileriniGirerVeSignInButonunaTiklar() {

        mPage.username.sendKeys(ConfigReader.getProperty("tuserUsername"));
        mPage.password.sendKeys(ConfigReader.getProperty("tuserPassword"));
        mPage.signIn.click();
    }

    @And("Giris yapan kullanici, isminin oldugu user butonuna tiklar")
    public void girisYapanKullaniciIsmininOlduguUserButonunaTiklar() {

        mPage.signAcoountMenu.click();
    }

    @And("Acilan dropdown menuden settings e tiklar")
    public void acilanDropdownMenudenSettingsETiklar() {

        mPage.settings.click();
    }

    @And("Settings sayfasinda firstname bilgisinin oldugunu dogrular")
    public void settingsSayfasindaFirstnameBilgisininOldugunuDogrular() {

        Assert.assertTrue(mPage.firstNameValu.isDisplayed());
    }

    @And("Settings sayfasinda lastname bilgisinin oldugunu dogrular")
    public void settingsSayfasindaLastnameBilgisininOldugunuDogrular() {

        Assert.assertTrue(mPage.lastNameValue.isDisplayed());
    }

    @And("Settings sayfasinda email bilgisinin oldugunu dogrular")
    public void settingsSayfasindaEmailBilgisininOldugunuDogrular() {

        Assert.assertTrue(mPage.emailValue.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {

        Driver.quitDriver();
    }

    @And("Settings sayfasinda yeni Firstname bilgisini girer")
    public void settingsSayfasindaYeniFirstnameBilgisiniGirer() {

        ReusableMethods.getActions().doubleClick(mPage.firstNameValu).sendKeys(ReusableMethods.getFaker().name().firstName()).perform();

    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {

        mPage.saveBut.click();
    }

    @And("Kullanici saved oldugunu dogrular")
    public void kullaniciSavedOldugunuDogrular() {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(mPage.succes.isDisplayed());
    }

    @And("Settings sayfasinda yeni Lastname bilgisini girer")
    public void settingsSayfasindaYeniLastnameBilgisiniGirer() {

        ReusableMethods.getActions().doubleClick(mPage.lastNameValue).sendKeys(ReusableMethods.getFaker().name().lastName()).perform();

    }

    @And("Settings sayfasinda yeni E-mail bilgisini girer")
    public void settingsSayfasindaYeniEMailBilgisiniGirer() {
        mPage.emailValue.clear();
        ReusableMethods.waitFor(2);
        ReusableMethods.getActions().doubleClick(mPage.emailValue).sendKeys(ReusableMethods.getFaker().internet().emailAddress()).perform();
        ReusableMethods.waitFor(1);
    }


}
