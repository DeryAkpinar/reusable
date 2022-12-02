package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US003_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_003StepDef {


    US003_Page us_03 = new US003_Page();
    Actions actions = new Actions(Driver.getDriver());


    @When("Kullanici medunna adresine gider Hk")
    public void kullaniciMedunnaAdresineGiderHk() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Kullanici anasayfada sag ust kosedeki kisi ikonuna tiklar Hk")
    public void kullaniciAnasayfadaSagUstKosedekiKisiIkonunaTiklarHk() {

        us_03.girisIkon.click();
    }

    @Then("Kullanici acilan dropdown menuden Register butonuna tiklar Hk")
    public void kullaniciAcilanDropdownMenudenRegisterButonunaTiklarHk() {

        us_03.registerLink.click();
    }

    @And("Kullanici kayit olmak icin Registiration sayfasina girdigini dogrular Hk")
    public void kullaniciKayitOlmakIcinRegistirationSayfasinaGirdiginiDogrularHk() {
        Assert.assertTrue(us_03.registrationYazisi.isDisplayed());
    }

    @And("Kullanici New Password kutusuna tiklar Hk")
    public void kullaniciNewPasswordKutusunaTiklarHk() {
        ReusableMethods.jsScrollClick(us_03.newPasswordKutusu);
    }

    @And("Kullanici en az bir veya daha fazla kucuk harf kullanilan bir {string} girer Hk")
    public void kullaniciEnAzBirVeyaDahaFazlaKucukHarfKullanilanBirGirerHk(String newSifreKucukHarf) {
        us_03.newPasswordKutusu.sendKeys(newSifreKucukHarf);
    }

    @Then("Kullanici  Password strength seviyesinin ikinci seviyeye gectigini dogrular Hk")
    public void kullaniciPasswordStrengthSeviyesininIkinciSeviyeyeGectiginiDogrularHk() {
        Assert.assertTrue(us_03.newPasswordIkinciSeviye.isDisplayed());
    }

    @And("Kullanici en az bir veya daha fazla buyuk harf kullanilan bir {string} girer Hk")
    public void kullaniciEnAzBirVeyaDahaFazlaBuyukHarfKullanilanBirGirerHk(String newSifreBuyukHarf) {
        us_03.newPasswordKutusu.sendKeys(newSifreBuyukHarf);
    }

    @And("Kullanici en az bir veya daha fazla rakam kullanilan bir {string} girer Hk")
    public void kullaniciEnAzBirVeyaDahaFazlaRakamKullanilanBirGirerHk(String newSifreRakam) {
        us_03.newPasswordKutusu.sendKeys(newSifreRakam);
    }

    @And("Kullanici en az bir veya daha fazla ozel karakter kullanilan bir {string} girer Hk")
    public void kullaniciEnAzBirVeyaDahaFazlaOzelKarakterKullanilanBirGirerHk(String newSifreOzelKarakter) {
        us_03.newPasswordKutusu.sendKeys(newSifreOzelKarakter);
    }

    @Then("Kullanici  Password strength seviyesinin besinci seviyeye gectigini dogrular Hk")
    public void kullaniciPasswordStrengthSeviyesininBesinciSeviyeyeGectiginiDogrularHk() {
        Assert.assertTrue(us_03.newPasswordBesinciSeviye.isDisplayed());
    }

    @And("Kullanici dort karakter iceren bir {string} girer Hk")
    public void kullaniciDortKarakterIcerenBirGirerHk(String newSifreDortKarakterli) {
        us_03.newPasswordKutusu.sendKeys(newSifreDortKarakterli);
    }

    @And("Kullanici New Password Confirmation kutusuna {string} yi tekrar girer Hk")
    public void kullaniciNewPasswordConfirmationKutusunaYiTekrarGirerHk(String newSifreDortKArakterliTekrar) {
        us_03.newPasswordConfirmationKutusu.sendKeys(newSifreDortKArakterliTekrar);
        ReusableMethods.waitFor(3);
    }

    @And("Kullanci Register butonuna tiklar Hk")
    public void kullanciRegisterButonunaTiklarHk() {
        ReusableMethods.jsScrollClick(us_03.registerSubmit);

        ReusableMethods.waitFor(3);
    }

    @And("Kullanici en fazla uc  veya daha az karakter iceren bir {string} girer Hk")
    public void kullaniciEnFazlaUcVeyaDahaAzKarakterIcerenBirGirerHk(String newSifreDorttenAzKarakterli) {
        us_03.newPasswordKutusu.sendKeys(newSifreDorttenAzKarakterli);

    }

    @And("Kullanici New Password Confirmation kutusuna en fazla uc  veya daha az karakter iceren {string} yi tekrar girer Hk")
    public void kullaniciNewPasswordConfirmationKutusunaEnFazlaUcVeyaDahaAzKarakterIcerenYiTekrarGirerHk(String newSifreDorttenAzKArakterliTekrar) {
        us_03.newPasswordConfirmationKutusu.sendKeys(newSifreDorttenAzKArakterliTekrar);
    }

    @Then("Kullanici gecerli parola icin en az dort karakter girmesi gerektigi mesajini gordugunu dogrular. Hk")
    public void kullaniciGecerliParolaIcinEnAzDortKarakterGirmesiGerektigiMesajiniGordugunuDogrularHk() {
        Assert.assertTrue(us_03.sifreKisaUyariMesaji.isDisplayed());
    }

    @And("Kullanici SSN no girisi yapar Hk")
    public void kullaniciSSNNoGirisiYaparHk() {
        us_03.sssnNoGiris.sendKeys(ReusableMethods.getFaker().idNumber().ssnValid());


    }

    @Then("Kullanici  dort karakterli bir sifre ile kayit olabildigini dogrular. Hk")
    public void kullaniciDortKarakterliBirSifreIleKayitOlabildiginiDogrularHk() {
        Assert.assertTrue(us_03.basariliKayitGostergesi.isDisplayed());
    }

    @And("Kullanici {string} , {string} , {string} , {string} girisi yapar Hk")
    public void kullaniciGirisiYaparHk(String firstname, String lastname, String username, String email) {

        firstname=Faker.instance().name().firstName();
        us_03.firstnameGiris.sendKeys(firstname);

        lastname=Faker.instance().name().lastName();
        us_03.lastnameGiris.sendKeys(lastname);

        username=Faker.instance().name().username();
        us_03.usernameGiris.sendKeys(username);

        email=Faker.instance().internet().emailAddress();
        us_03.emailGiris.sendKeys(email);

    }


    @And("Kullanici buyuk ve kucuk harf, rakam ve ozel karakter iceren en az yedi karakterli bir {string} girer Hk")
    public void kullaniciBuyukVeKucukHarfRakamVeOzelKarakterIcerenEnAzYediKarakterliBirGirerHk(String newSifreKarisik) {
        us_03.newPasswordKutusu.sendKeys(newSifreKarisik);
    }

    @And("Kullanici yalniz kucuk, yalniz buyuk, yalniz rakam ve yalniz ozel karakterlerden olusan en az yedi veya daha fazla karakter iceren {string} girer Hk")
    public void kullaniciYalnizKucukYalnizBuyukYalnizRakamVeYalnizOzelKarakterlerdenOlusanEnAzYediVeyaDahaFazlaKarakterIcerenGirerHk(String sifreler) {
        us_03.newPasswordKutusu.sendKeys(sifreler, Keys.TAB);
        ReusableMethods.waitFor(3);

    }

    @And("Kullanici  Password strength seviyesinin guclenmedigini, birinci seviyede kaldigini dogrular Hk")
    public void kullaniciPasswordStrengthSeviyesininGuclenmediginiBirinciSeviyedeKaldiginiDogrularHk() throws IOException {
       // ReusableMethods.waitForVisibility(us_03.newPasswordStrength,3);
        ReusableMethods.getScreenshotWebElement("US_003 TC_006 passwordStrengthSeviyesiGuclenmemesi",us_03.newPasswordStrength);
        Assert.assertTrue(us_03.newPasswordBirinciSeviye.isDisplayed());
        ReusableMethods.waitFor(2);

    }
}
