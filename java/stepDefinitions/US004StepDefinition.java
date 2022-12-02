package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US004pages;
import utilities.Driver;
import utilities.ReusableMethods;

public class US004StepDefinition {
    US004pages mehmet =new US004pages();

    @When("sag ust kosede yer alan kisi ikonuna tiklar")
    public void sagUstKosedeYerAlanKisiIkonunaTiklar() {
     mehmet.girisButonu.click();
    }

    @Then("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        mehmet.signInButonu.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        mehmet.usernameTextbox.sendKeys("Batch81");
        ReusableMethods.waitFor(3);
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys("54koo").perform();
        ReusableMethods.waitFor(3);
    }

    @And("giris yapilamadigi dogrulanir")
    public void girisYapilamadigiDogrulanir() {
        ReusableMethods.waitForVisibility(mehmet.basarisizGirisDogrulama,5);
        assert mehmet.basarisizGirisDogrulama.isDisplayed();
    }

    @And("SignIn butonuna tiklar")
    public void signinButonunaTiklar() {
        ReusableMethods.getActions().sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }


    @And("Kullanici gecersiz username girer")
    public void kullaniciGecersizUsernameGirer() {
        mehmet.usernameTextbox.sendKeys("Batch82");
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici gecerli password girer")
    public void kullaniciGecerliPasswordGirer() {
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys("Batch81+").perform();
        ReusableMethods.waitFor(3);

    }

    @And("Sayfaya basarili giris yapildigi dogrulanir")
    public void sayfayaBasariliGirisYapildigiDogrulanir() {
        assert mehmet.basariliGirisDogrulama.isDisplayed();
    }

    @And("Remember me oldugu dogrulanir")
    public void rememberMeOlduguDogrulanir() {
        assert mehmet.rememberMebutton.isDisplayed();
    }

    @And("Did you forget your password?  seçeneği oldugu dogrulanir")
    public void didYouForgetYourPasswordSeçeneğiOlduguDogrulanir() {
        assert mehmet.didYouForgetPasswordButton.isDisplayed();
    }

    @And("You don't have an account yet? Register a new account  seçeneği oldugu dogrulanir")
    public void youDonTHaveAnAccountYetRegisterANewAccountSeçeneğiOlduguDogrulanir() {
        assert mehmet.registerNewAccountButton.isDisplayed();
    }

    @And("Cancel secenegi oldugu dogrulanir")
    public void cancelSecenegiOlduguDogrulanir() {
        assert mehmet.cancelButton.isDisplayed();
    }
}
