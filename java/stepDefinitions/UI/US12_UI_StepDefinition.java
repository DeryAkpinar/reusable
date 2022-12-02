package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.StaffPage;
import pages.TestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class US12_UI_StepDefinition {
    StaffPage pageUS9 = new StaffPage();
    TestPage pageUS12 = new TestPage();
    @Given("Doctor {string} sayfasına giderZZ")
    public void doctorSayfasınaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Sayfanın sağ üst köşesindeki human ikonuna tıklarZZ")
    public void sayfanınSağÜstKöşesindekiHumanIkonunaTıklar() {
        pageUS9.accountMenu.click();
    }

    @And("Açılan dropdown menude Sign in seçeneğini seçerZZ")
    public void açılanDropdownMenudeSignInSeçeneğiniSeçer() {
        pageUS9.accountSignIn.click();
    }

    @And("Username kutusuna {string} girerZZ")
    public void usernameKutusunaGirer(String doctorUsername) {
        pageUS9.signInUserName.sendKeys(ConfigReader.getProperty("doctorZUsername"));    }

    @And("Password kutusuna {string} girerZZ")
    public void passwordKutusunaGirer(String doctorPassword) {
        pageUS9.signInPassword.sendKeys(ConfigReader.getProperty("doctorZPassword"));    }

    @And("Sign in butonunu tıklarZZ")
    public void signInButonunuTıklar() {
        pageUS9.signInButton.click();
    }

    @And("MY PAGES dropdown menusune tıklarZZ")
    public void myPAGESDropdownMenusuneTıklar() {
        pageUS9.myPages.click();
        ReusableMethods.waitFor(1);    }

    @And("My Appointments seçeneğini seçerZZ")
    public void myAppointmentsSeçeneğiniSeçer() {
        pageUS12.myAppointments.click();
        ReusableMethods.waitFor(1);    }

    @And("Atanan hasta için Edit butonunu tıklarZZ")
    public void atananHastaIçinEditButonunuTıklar() {
        pageUS12.PatientEdit.click();
    }

    @And("Request A Test butonunu tıklarZZ")
    public void requestATestButonunuTıklar() {
        ReusableMethods.waitFor(2);
        pageUS12.requestATestButton.click();    }

    @Then("Test Items yazısının görünür olduğunu test ederZZ")
    public void testItemsTablosununGörünürOlduğunuTestEder() {
        Assert.assertTrue(pageUS12.TestItemsHeader.getText().contains("Test Items"));
        ReusableMethods.waitFor(1);    }

    @And("Sayfayı kapatırZZ")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }

    @Then("Test Items tablosunda Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin seçenekleri olduğunu test ederZZ")
    public void testItemsTablosundaGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinSeçenekleriOlduğunuTestEder() throws AWTException {
            ReusableMethods.sayfaKucult();
            ReusableMethods.jsScrollClick(pageUS12.sodiumBox);
            ReusableMethods.jsScrollClick(pageUS12.potassiumnBox);
            ReusableMethods.jsScrollClick(pageUS12.creatinineBox);
            ReusableMethods.jsScrollClick(pageUS12.glucoseBox);
            ReusableMethods.jsScrollClick(pageUS12.ureaBox);
            ReusableMethods.jsScrollClick(pageUS12.hemoglobinBox);
            ReusableMethods.jsScrollClick(pageUS12.albuminBox);
            ReusableMethods.jsScrollClick(pageUS12.totalProteinBox);
            Assert.assertTrue(pageUS12.sodiumBox.isSelected());
            Assert.assertTrue(pageUS12.potassiumnBox.isSelected());
            Assert.assertTrue(pageUS12.creatinineBox.isSelected());
            Assert.assertTrue(pageUS12.glucoseBox.isSelected());
            Assert.assertTrue(pageUS12.ureaBox.isSelected());
            Assert.assertTrue(pageUS12.hemoglobinBox.isSelected());
            Assert.assertTrue(pageUS12.albuminBox.isSelected());
            Assert.assertTrue(pageUS12.totalProteinBox.isSelected());        }
    }

