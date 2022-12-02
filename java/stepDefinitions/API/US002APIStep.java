package stepDefinitions.API;


import baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.*;

import io.restassured.response.Response;
import pojos.User;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US002APIStep extends MedunnaBaseUrl {

   // String url;
    Response response;
    User expectedData;


    @Given("FA Kullanici yeni kaydin kayit bilgilerine get request gönderir {string}")
    public void fakullaniciYeniKaydinKayitBilgilerineGetRequestGönderir(String url) {


      //  url = "https://www.medunna.com/api/user?ssn=332-61-3332";
        response = given().headers("Authorization", "Bearer " + generateToken())
                .when()
                .get(url);
        response.prettyPrint();
    }


    @When("FA Kullanici status kodunun {int} oldugunu görür.")
    public void fakullaniciStatusKodununOldugunuGörür(int statusCode) {

        assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("FA Kullanici username ve email  dogrular")
    public void fakullaniciUsernameVeEmailDogrular() {
        expectedData = new User(317295, "seymaoz", "Şeyma", "Öz", "332-61-3332", "seymaoz@gmail.com", null, false, null,null,null,null);

        User actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), User.class);


        assertEquals(expectedData.getLogin(), actualData.getLogin());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
    }



}
