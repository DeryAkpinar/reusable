package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.StaffPage;
import pojos.InfoEdit;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class US009_UI_Admin_StepDefinitions {
    StaffPage page = new StaffPage();
    Actions actions = new Actions(Driver.getDriver());
    InfoEdit obj = new InfoEdit("10789", "Ahmet",
            "Han", "11112011", "1140",
            "han@gmail.com", "1234567890", "MALE", "A-",
            "Çarşamba Pazarı", "x", "hy", "Türkiye", "Ankara");
    @Given("Admin {string} sayfasına giderZZ")
    public void adminSayfasınaGiderZZ(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Admin Sayfanın sağ üst köşesindeki human ikonuna tıklarZZ")
    public void adminSayfanınSağÜstKöşesindekiHumanIkonunaTıklarZZ() {
        page.accountMenu.click();
    }

    @And("Admin Açılan dropdown menude Sign in seçeneğini seçerZZ")
    public void adminAçılanDropdownMenudeSignInSeçeneğiniSeçerZZ() {
        page.accountSignIn.click();
    }

    @And("Admin Username kutusuna {string} girerZZ")
    public void adminUsernameKutusunaGirerZZ(String adminUsername) {
        page.signInUserName.sendKeys(ConfigReader.getProperty("adminZUsername"));    }

    @And("Admin Password kutusuna {string} girerZZ")
    public void adminPasswordKutusunaGirerZZ(String adminPassword) {
        page.signInPassword.sendKeys(ConfigReader.getProperty("adminZPassword"));    }
    @And("Admin Sign in butonunu tıklarZZ")
    public void adminSignInButonunuTıklarZZ() {   page.signInButton.click();   }

    @And("Admin {string} dropdown menusune tıklarZZ")
    public void adminItemsTitlesDropdownMenusuneTıklarZZ(String str) {
        page.adminItemsTitlesMenu.click();
    }

    @And("Admin Açılan dropdown menude {string} sekmesi seçeneğini seçerZZ")
    public void adminAçılanDropdownMenudePatientSekmesiSeçeneğiniSeçerZZ(String str) {
        page.adminPatient.click();
    }

    @Then("Admin Patients bilgilerinin görünür olduğunu test ederZZ")
    public void adminPatientsBilgilerininGörünürOlduğunuTestEderZZ() {
        List<WebElement> patientTableInfoList = page.tablePatientsCellsInfo;
        for (int i = 0; i < patientTableInfoList.size() ; i++) {
            Assert.assertTrue(patientTableInfoList.get(i).isDisplayed());
            i++;}    }
    @And("Admin sayfayı kapatırZZ")
    public void adminSayfayıKapatırZZ() {
        Driver.closeDriver();
    }

    @Then("Admin Patients tablosundaki bilgilerini düzenlemek istediği hastanın yanında yer alan {string} butonuna tıklarZZ")
    public void adminPatientsTablosundakiBilgileriniDüzenlemekIstediğiHastanınYanındaYerAlanButonunaTıklarZZ(String arg0) {
        ReusableMethods.jsScrollClick(page.editButton);
        ReusableMethods.waitFor(3);    }

    @And("Admin tüm Patient bilgilerinin duzenlenebildiğini test ederZZ")
    public void adminTümPatientBilgilerininDuzenlenebildiğiniTestEderZZ() throws IOException, AWTException {
        ReusableMethods.sayfaKucult();
        page.patientDescriptionInfoEdit.clear();
        ReusableMethods.jsScroll(page.patientIdInfoEdit);
        page.patientIdInfoEdit.sendKeys(obj.getId());
        actions .sendKeys(Keys.TAB).sendKeys(obj.getFirstName())
                .sendKeys(Keys.TAB).sendKeys(obj.getLastName())
                .sendKeys(Keys.TAB).sendKeys(obj.getBirthDate())
                .sendKeys(Keys.TAB).sendKeys(obj.getBirthDateHour_Munite())
                .sendKeys(Keys.TAB).sendKeys(obj.getEmail())
                .sendKeys(Keys.TAB).sendKeys(obj.getPhone())
                .sendKeys(Keys.TAB).sendKeys(obj.getGender())
                .sendKeys(Keys.TAB).sendKeys(obj.getBloodGroup())
                .sendKeys(Keys.TAB).sendKeys(obj.getAddress())
                .sendKeys(Keys.TAB).sendKeys(obj.getDescription())
                .sendKeys(Keys.TAB).sendKeys(obj.getUser())
                .sendKeys(Keys.TAB).sendKeys(obj.getCountry())
                .sendKeys(Keys.TAB).sendKeys(obj.getState_City())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.jsScroll(page.adminviewUpdate);
        page.adminviewUpdate.click();
        ReusableMethods.sayfaKucult();
        ReusableMethods.jsScroll(page.stateUpdateEdit);
        ReusableMethods.getScreenshot("AdminState");
        ReusableMethods.waitFor(1);
        List<WebElement> viewPatientInfoList = page.viewPatientInfo;
        for (int i = 0; i < viewPatientInfoList.size() ; i++) {
            Assert.assertFalse(viewPatientInfoList.contains(obj.getState_City()));
            i++;}   }
    @And("Admin sayfayi kapatirZZ")
    public void adminSayfayiKapatirZZ() {
        Driver.closeDriver();
    }

    @Then("Admin Patient SSN kutusu olmadığından bilgilerini görmek istedigi SSN numarasını giremezZZ")
    public void adminPatientSSNKutusuOlmadığındanBilgileriniGörmekIstedigiSSNNumarasınıGiremezZZ() throws AWTException {
        ReusableMethods.sayfaKucult();
        ReusableMethods.jsScroll(page.createANewPatientButton);    }

    @And("Admin hastaları SSN kimliklerine göre arayamadığını test ederZZ")
    public void adminHastalarıSSNKimliklerineGöreArayamadığınıTestEderZZ() {
        Assert.assertTrue(page.createANewPatientButton.isDisplayed());    }

    @Then("Admin Patients tablosundaki bilgilerini silmek istediği hastanın yanında yer alan {string} butonuna tıklarZZ")
    public void adminPatientsTablosundakiBilgileriniSilmekIstediğiHastanınYanındaYerAlanButonunaTıklarZZ(String arg0) {
        ReusableMethods.jsScrollClick(page.editButton);
        ReusableMethods.waitFor(3);    }

    @And("Admin kayıt bilgilerini siler, save butonuna tıklarZZ")
    public void adminKayıtBilgileriniSilerSaveButonunaTıklarZZ() throws AWTException {
        ReusableMethods.sayfaKucult();
        page.patientFirstNameInfoEdit.clear();
        page.patientFirstNameInfoEdit.sendKeys("*");
        ReusableMethods.waitFor(2);
        page.patientLastNameInfoEdit.clear();
        page.patientLastNameInfoEdit.sendKeys("*");
        ReusableMethods.jsScroll(page.countryScroll);
        page.patientInfoEditSaveButton.submit();
        ReusableMethods.waitFor(2);    }

    @And("Admin hasta bilgilerinin silinip silinmediğini test ederZZ")
    public void adminHastaBilgilerininSilinipSilinmediğiniTestEderZZ() throws IOException {
        Assert.assertTrue(page.patientIsUpdated.isDisplayed());    }
}
