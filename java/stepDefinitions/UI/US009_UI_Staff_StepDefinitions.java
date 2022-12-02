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

public class US009_UI_Staff_StepDefinitions {
    StaffPage page = new StaffPage();
    Actions actions = new Actions(Driver.getDriver());
    InfoEdit obj = new InfoEdit("10789", "Ahmet",
            "Han", "11112011", "1140",
            "han@gmail.com", "1234567890", "MALE", "A-",
            "Çarşamba Pazarı", "x", "hy", "Turkey", "Ankara");
    @Given("Staff {string} sayfasına giderZZ")
    public void staff_sayfasına_gider_zz(String string) { Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));  }
    @Given("Staff Sayfanın sağ üst köşesindeki human ikonuna tıklarZZ")
    public void staff_sayfanın_sağ_üst_köşesindeki_human_ikonuna_tıklar_zz() {   page.accountMenu.click(); }
    @Given("Staff Açılan dropdown menude Sign in seçeneğini seçerZZ")
    public void staff_açılan_dropdown_menude_sign_in_seçeneğini_seçer_zz() {     page.accountSignIn.click(); }
    @Given("Staff Username kutusuna {string} girerZZ")
    public void staff_username_kutusuna_girer_zz(String string) { page.signInUserName.sendKeys(ConfigReader.getProperty("staffZUsername"));  }
    @Given("Staff Password kutusuna {string} girerZZ")
    public void staff_password_kutusuna_girer_zz(String string) { page.signInPassword.sendKeys(ConfigReader.getProperty("staffZPassword"));   }
    @Given("Staff Sign in butonunu tıklarZZ")
    public void staff_sign_in_butonunu_tıklar_zz() {  page.signInButton.click();  }
    @Given("Staff MY PAGES dropdown menusune tiklarZZ")
    public void staff_my_pages_dropdown_menusune_tiklar_zz() {  page.myPages.click(); }
    @Given("Staff Açılan dropdown menude {string} seçeneğini seçerZZ")
    public void staff_açılan_dropdown_menude_seçeneğini_seçer_zz(String string) { page.searchPatients.click();  }
    @Then("Staff Search Patients sekmesinde hasta bilgilerinin gorunur oldugunu test ederZZ")
    public void staff_search_patients_sekmesinde_hasta_bilgilerinin_gorunur_oldugunu_test_eder_zz() {
        List<WebElement> patientTableInfoList = page.tablePatientsCellsInfo;
        for (int i = 0; i < patientTableInfoList.size() ; i++) {
            Assert.assertTrue(patientTableInfoList.get(i).isDisplayed());
            i++;}    }
    @Then("Staff sayfayi kapatirZZ")
    public void staff_sayfayi_kapatir_zz() {
        Driver.closeDriver();
    }

    @Given("Staff Patients tablosundaki bilgilerini düzenlemek istediği hastanın yanında yer alan {string} butonuna tıklarZZ")
    public void staff_patients_tablosundaki_bilgilerini_düzenlemek_istediği_hastanın_yanında_yer_alan_butonuna_tıklar_zz(String string) {
        ReusableMethods.jsScrollClick(page.editButton);
        ReusableMethods.waitFor(3);    }
    @Then("Staff tüm hasta bilgilerinin duzenlenebilir oldugunu test ederZZ")
    public void staff_tüm_hasta_bilgilerinin_duzenlenebilir_oldugunu_test_eder_zz() throws IOException, AWTException {
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
        ReusableMethods.waitFor(2);
        Assert.assertTrue(page.patientIsUpdated.isDisplayed());
        ReusableMethods.sayfaKucult();
        ReusableMethods.jsScroll(page.stateUpdateEdit);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("State");
        List<WebElement> viewPatientInfoList = page.viewPatientInfo;
        for (int i = 0; i < viewPatientInfoList.size() ; i++) {
            Assert.assertFalse(viewPatientInfoList.contains(obj.getState_City()));
            i++;}   }
    @Given("Staff Patient SSN kutusuna bilgilerini görmek istedigi SSN numarasını girerZZ")
    public void staffPatientSSNKutusunaBilgileriniGörmekIstedigiSSNNumarasınıGirerZZ() {
        page.ssnBox.sendKeys("444-45-4568", Keys.ENTER);    }

    @And("Staff Patient bilgisinin yanında yer alan {string} butonunu tıklarZZ")
    public void staffPatientBilgisininYanındaYerAlanButonunuTıklarZZ(String arg0) {
        ReusableMethods.waitForVisibility(page.viewButton, 2);
        ReusableMethods.jsScrollClick(page.viewButton);    }

    @Then("Staff kayit bilgilerinin gorunur oldugunu test ederZZ")
    public void staffKayitBilgilerininGorunurOldugunuTestEderZZ() {
       Assert.assertTrue(page.viewControl.isDisplayed());}

    @And("Staff kayıt bilgilerini siler, save butonuna tıklarZZ")
    public void staffKayıtBilgileriniSilerSaveButonunaTıklarZZ() throws AWTException {
        ReusableMethods.sayfaKucult();
        page.patientFirstNameInfoEdit.clear();
        page.patientFirstNameInfoEdit.sendKeys("*");
        ReusableMethods.waitFor(2);
        page.patientLastNameInfoEdit.clear();
        page.patientLastNameInfoEdit.sendKeys("*");
        ReusableMethods.jsScroll(page.countryScroll);
        page.patientInfoEditSaveButton.submit();
        ReusableMethods.waitFor(2);    }
    @Given("Staff Patients tablosundaki bilgilerini silmek istediği hastanın yanında yer alan {string} butonuna tıklarZZ")
    public void staffPatientsTablosundakiBilgileriniSilmekIstediğiHastanınYanındaYerAlanButonunaTıklarZZ(String arg0) {
        ReusableMethods.jsScrollClick(page.editButton);
        ReusableMethods.waitFor(3);    }

    @Then("Staff hasta bilgilerinin silinip silinmediğini test ederZZ")
    public void staffHastaBilgilerininSilinipSilinmediğiniTestEderZZ() {
        Assert.assertTrue(page.patientIsUpdated.isDisplayed());    }
}
