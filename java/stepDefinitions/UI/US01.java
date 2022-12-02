package stepDefinitions.UI;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class US01 {
    @Then("kullanici kayit sayfasini acar")
    public void kullaniciKayitSayfasiniAcar() throws InterruptedException {
        By accountMenu = By.xpath("//*[@id='account-menu']");
        ReusableMethods.click(accountMenu);
        ReusableMethods.homepageClick("Register");
    }

    @Then("kullanici kayit bilgilerini girer")
    public void kullaniciKayitBilgileriniGirer(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> kayitBilgileri = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> e : kayitBilgileri) {
            for (Map.Entry<String, String> entry : e.entrySet()) {
                ReusableMethods.enterField(entry.getKey(), entry.getValue());
            }
        }
        ReusableMethods.scrollDownJs();
        Thread.sleep(500);
        ReusableMethods.clickButton("Register");
        Assert.assertTrue(ReusableMethods.elementIsDisplayed("Registration Saved"));
    }


    @Then("kullanici invalid {string} bilgisi kayit olamadigini dogrular")
    public void kullaniciInvalidBilgisiKayitOlamadiginiDogrular(String invalidValue, DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> kayitBilgileri = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> e : kayitBilgileri) {
            for (Map.Entry<String, String> entry : e.entrySet()) {
                ReusableMethods.enterField(entry.getKey(), entry.getValue());
            }
            Assert.assertTrue(ReusableMethods.confirmValid(invalidValue));
        }
    }

    @Then("kullanici {string} olarak hesaba girer")
    public void kullanici_olarak_hesaba_girer(String string, io.cucumber.datatable.DataTable dataTable) {
        By accountMenu = By.xpath("//*[@id='account-menu']");
        ReusableMethods.click(accountMenu);
        ReusableMethods.homepageClick("Sign in");
        List<Map<String, String>> kayitBilgileri = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> e : kayitBilgileri) {
            for (Map.Entry<String, String> entry : e.entrySet()) {
                ReusableMethods.enterField(entry.getKey(), entry.getValue());
            }
            ReusableMethods.clickButton("Sign in");
        }
    }

    @Then("{string} clicks on {string}")
    public void clicks_on(String user, String button) throws InterruptedException {
        Thread.sleep(1000);
        ReusableMethods.homepageClick(button);
        Thread.sleep(1000);
    }

    @Then("{string} select {string} patient clicks your {string}")
    public void select_patient_clicks_your(String string, String string2, String selectedElement) {
        ReusableMethods.homepageClick(selectedElement);


    }

    @Then("{string} should see and verify all test information")
    public void should_see_and_verify_all_test_information(String role) {
        List<String> expected_list = new ArrayList<>();
        expected_list.add("ID");
        expected_list.add("Name");
        expected_list.add("Result");
        expected_list.add("Default Min. Value");
        expected_list.add("Default Max. Value");
        expected_list.add("Description");
        expected_list.add("Date");
        List<String> actual_list = new ArrayList<>();
        Assert.assertEquals(expected_list, ReusableMethods.getHeadText());
        System.out.println(expected_list);
    }


    @Then("{string} select {string} patient id clicks your {string}")
    public void select_patient_id_clicks_your(String string, String string2, String string3) {
        ReusableMethods.homepageClick(string3);
    }

    @Then("{string} verify {string} patient")
    public void verify_patient(String string, String string2) {
        Assert.assertTrue(ReusableMethods.containTextDisplayed(string2));
    }


    @And("{string} wait details")
    public void waitDetails(String arg0) {
        ReusableMethods.elementIsDisplayed(arg0);
    }

    @Given("kullanici {string} url'e gider")
    public void kullaniciUrlEGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
}

