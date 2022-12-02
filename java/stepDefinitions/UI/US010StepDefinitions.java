package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedmeminPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US010StepDefinitions {

    MedmeminPages mPage = new MedmeminPages();
    @Given("Kullanici doktor medunnaUrl'e gider")
    public void kullaniciDoktorMedunnaUrlEGider() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici doktor user ikonuna tiklar")
    public void kullaniciDoktorUserIkonunaTiklar() {

        mPage.accountMenu.click();
    }

    @Then("Kullanici doktor acilan dropdown menuden sign in butonuna tiklar")
    public void kullaniciDoktorAcilanDropdownMenudenSignInButonunaTiklar() {

        mPage.dropSign.click();
    }

    @And("Kullanici doktor olarak username ve password bilgilerini girer ve sign in butonuna tiklar")
    public void kullaniciDoktorOlarakUsernameVePasswordBilgileriniGirerVeSignInButonunaTiklar() {

        mPage.username.sendKeys(ConfigReader.getProperty("doktorUsernamee"));
        mPage.password.sendKeys(ConfigReader.getProperty("doktorPassworde"));
        mPage.signIn.click();
    }

    @And("Kullanici doktor Mypages butonuna tiklar")
    public void kullaniciDoktorMypagesButonunaTiklar() {

        mPage.myPages.click();
    }

    @And("Acilan dropdown menuden  Myappointments butonuna tiklar")
    public void acilanDropdownMenudenMyappointmentsButonunaTiklar() {

        mPage.myAppointment.click();
    }

    @And("Kullanici doktor acilan sayfada randevu listesinin ve zaman dilimlerinin oldugunu dogrular")
    public void kullaniciDoktorAcilanSayfadaRandevuListesininVeZamanDilimlerininOldugunuDogrular() {
        Assert.assertTrue(mPage.fromDate.isDisplayed());
        Assert.assertTrue(mPage.toDate.isDisplayed());

        Assert.assertTrue(mPage.bodyAppoint.isDisplayed());
        System.out.println(mPage.bodyAppoint.getText());
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {

        Driver.quitDriver();
    }

    @And("Kullanici doktor acilan sayfada patient id, start date, end date, status bilgilerinin oldugunu dogrular")
    public void kullaniciDoktorAcilanSayfadaPatientIdStartDateEndDateStatusBilgilerininOldugunuDogrular() {

        Assert.assertTrue(mPage.idHead.isDisplayed());
        Assert.assertTrue(mPage.sdtHead.isDisplayed());
        Assert.assertTrue(mPage.edtHead.isDisplayed());
        Assert.assertTrue(mPage.statusHead.isDisplayed());
    }
}
