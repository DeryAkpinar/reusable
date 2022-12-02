package stepDefinitions.DB;


import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DataBaseUtility;

import java.util.List;

public class US002DBStep {
    @Given("FA Kullanici connection kurar")
    public void fakullaniciConnectionKurar() {
        DataBaseUtility.createConnection();
    }

    @When("FA Kullanici  tum bilgilerini alir {string}")
    public void fakullaniciTumBilgileriniAlir(String query) {
      List<Object> actualData = DataBaseUtility.getRowList(query);
        System.out.println("actualData = " + actualData);
    }

    @Then("FA Kullanici   emaili dogrular {string}")
    public void fakullaniciEmailiDogrular(String query) {
        Object actualEmail = DataBaseUtility.getCellValuewithRowsAndCells(query,0,5);
        System.out.println(actualEmail);
       //  String expectedEmail = "seymaoz@gmail.com";
        String expectedEmail = "ayseoz@gmail.com";

        Assert.assertEquals(expectedEmail,actualEmail);

    }



}
