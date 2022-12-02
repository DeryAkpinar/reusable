package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import testDatas.US_009_MapTestData;
import utilities.DataBaseUtility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utilities.DataBaseUtility.*;

/*
 * @return Database Connection data
 * name = Medunna
 * host = medunna.com
 * Database = medunna_db
 * username = medunna_user
 * password = medunna_pass_987
 */
public class US009_DB_StepDEf {
    public static int totalPatientNumber_DB;
    public static List<Object> patientList_DB;
    @Given("Kullanici medunna database e baglanirZZ")
    public void kullaniciMedunnaDatabaseEBaglanir() {  createConnection(); }
    @Then("Kullanici database'den tum hasta bilgilerini alirZZ")
    public void kullaniciDatabaseDenTumHastaBilgileriniAlir() {
        patientList_DB = getColumnData("select * from patient", "id");
        totalPatientNumber_DB = patientList_DB.size();

        String query = "select * from patient where id=310803";
        //System.out.println("query = " + query);

        US_009_MapTestData mapObj = new US_009_MapTestData();
        Map<String, Object> expectedMap = mapObj.expectedMap("MALE", null, "1977-01-01 08:30:00.0",
                "Canan", "Kemik Kanseri", "2022-11-21 11:58:16.138871",
                "Istanbul", "staffcanc", "patientcanc",
                "5555555555", 188518, "Apositive", 310803,
                "2022-08-14T13:03:18.038906Z", "Patient Can", 43955, "patientcanc@gmail.com");
        System.out.println("expectedMap = " + expectedMap);

        Map<String, Object> actualMap = new HashMap<>(DataBaseUtility.getRowMap(query));
        System.out.println("actualMap = " + actualMap);

        Assert.assertEquals(expectedMap.get("gender"), actualMap.get("gender"));
        Assert.assertEquals(expectedMap.get("cstate_id"), actualMap.get("cstate_id"));
        Assert.assertEquals(expectedMap.get("last_name"), actualMap.get("last_name"));
        Assert.assertEquals(expectedMap.get("description"), actualMap.get("description"));
        Assert.assertEquals(expectedMap.get("adress"), actualMap.get("adress"));
        Assert.assertEquals(expectedMap.get("phone"), actualMap.get("phone"));
        Assert.assertEquals(expectedMap.get("blood_group"), actualMap.get("blood_group"));
        Assert.assertEquals(expectedMap.get("first_name"), actualMap.get("first_name"));
        Assert.assertEquals(expectedMap.get("email"), actualMap.get("email"));    }

    @And("Kullanıcı database bağlantısını kapatırZZ")
    public void kullanıcıDatabaseBağlantısınıKapatır() {
        closeConnection();
    }
}



